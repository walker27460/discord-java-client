package jp.kurages.discord.services;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Map;

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

	private Request.RequestBuilder requestBuilder(String url, HttpMethod method){
		ContentType contentType;
		switch(method){
			case DELETE:
			case GET:
				contentType = ContentType.FORM_URLENCODED;
				break;
			default:
				contentType = ContentType.APPLIACTION_JSON;
				break;
		}
		return Request.builder()
			.baseUrl(url)
			.method(method)
			.headers("Content-Type", contentType.getValue())
			.headers("Authorization", token.getToken());
	}

	protected String sendRequest(String url, HttpMethod method) throws ServiceException {
		try {
			String response = new Requests(requestBuilder(url, method).build()).send();
			return response;
		} catch (IOException | InterruptedException e) {
			throw new ServiceException(e);
		}
	}

	protected String sendRequest(String url, HttpMethod method, RequestParam data) throws ServiceException{
		var req = requestBuilder(url, method);
		for (Map.Entry<String, String> e: data.getParams().entrySet()) {
			req.data(e.getKey(), e.getValue());
		}
		try {
			String response = new Requests(req.build()).send();
			return response;
		} catch (IOException | InterruptedException e) {
			throw new ServiceException(e);
		}
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
