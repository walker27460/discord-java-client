package jp.kurages.discord.client.oauth2;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.client.Token;
import jp.kurages.requests.ContentType;
import jp.kurages.requests.HttpMethod;
import jp.kurages.requests.Request;
import jp.kurages.requests.Requests;
import jp.kurages.requests.utils.JsonUtil;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OAuth2Client implements Client {
	private final String clientId;
	private final String clientSecret;
	private final String grantType;
	private final String redirectUri;
	private final String code;

	private Token token;

	private Requests getRequests(){
		return new Requests(Request.builder()
			.url(Endpoints.TOKEN_URL)
			.method(HttpMethod.POST)
			.headers("Content-Type", ContentType.FORM_URLENCODED.getValue())
			.data("client_id", this.clientId)
			.data("client_secret", this.clientSecret)
			.data("grant_type", this.grantType)
			.data("redirect_uri", this.redirectUri)
			.data("code", this.code)
			.build());
	}


	public void exchangeCode() {
		Requests requests = getRequests();
		String response = requests.send();
		token = JsonUtil.fromJson(response, OAuth2Token.class);
	}


	@Override
	public Token refreshToken() {
		throw new UnsupportedOperationException("Unimplemented method 'refreshToken'");
	}
}
