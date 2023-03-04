package jp.kurages.discord.services;

import java.text.MessageFormat;

import jp.kurages.discord.client.Token;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import jp.kurages.requests.ContentType;
import jp.kurages.requests.HttpMethod;
import jp.kurages.requests.Request;
import jp.kurages.requests.Requests;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Base {
	protected final Token token;

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

	protected void checkScopes(OAuth2Scopes... scopes){
		for (OAuth2Scopes scope : scopes) {
			if(!token.checkScope(scope)){
				throw new IllegalStateException("Unauthorized");
			}
		}
	}
}
