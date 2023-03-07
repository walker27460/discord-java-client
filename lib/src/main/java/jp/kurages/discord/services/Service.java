package jp.kurages.discord.services;

import java.text.MessageFormat;

import jp.kurages.discord.client.Client;
import jp.kurages.discord.client.Token;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import jp.kurages.requests.ContentType;
import jp.kurages.requests.HttpMethod;
import jp.kurages.requests.Request;
import jp.kurages.requests.Requests;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Service {
	protected final Client client;
	protected Token token;

	public Service(Client client){
		this.client = client;
		this.token = client.getToken();
	}

	protected String format(String text, Object... args){
		return MessageFormat.format(text, args);
	}

	protected String getRequest(String url, HttpMethod method){
		String response = new Requests(Request.builder()
			.headers("Content-Type", ContentType.APPLIACTION_JSON.getValue())
			.headers("Authorization", token.getToken())
			.url(url)
			.method(method)
			.build()
		).send();
		return response;
	}

	protected void isExecutable(OAuth2Scopes... scopes){
		if(token.checkRefreshToken()){
			token = client.refreshToken();
		}
		for (OAuth2Scopes scope : scopes) {
			if(!token.checkScope(scope)){
				throw new IllegalStateException("Unauthorized");
			}
		}
	}
}
