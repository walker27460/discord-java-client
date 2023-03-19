package jp.kurages.discord.client.oauth2;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import jp.kurages.requests.ContentType;
import jp.kurages.requests.HttpMethod;
import jp.kurages.requests.Request;
import jp.kurages.requests.Requests;
import jp.kurages.requests.utils.JsonUtil;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
@ToString
@RequiredArgsConstructor
public class OAuth2Client implements Client {
	private final String clientId;
	private final String clientSecret;
	private final String grantType;
	private final String redirectUri;
	private final List<OAuth2Scopes> scopes;
	private final String code;

	private OAuth2Token token;

	/**
	 * OAuth2認証用URL生成
	 * @return URL
	 */
	public String getURL(){
		List<String> scopes = this.scopes.stream()
			.map(OAuth2Scopes::getValue)
			.collect(Collectors.toList());
		return new StringBuilder()
			.append(Endpoints.AUTHORIZATION)
			.append("?client_id=").append(clientId)
			.append("&redirect_uri=").append(redirectUri)
			.append("&response_type=").append(grantType)
			.append("&scope=").append(StringUtils.join(scopes, "%20"))
			.toString();
	}

	private Requests getRequests(){
		return new Requests(Request.builder()
			.baseUrl(Endpoints.TOKEN_URL)
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
		try {
			Requests requests = getRequests();
			String response = requests.send();
			token = JsonUtil.fromJson(response, OAuth2Token.class);
		}catch(Exception e){
			// TODO これは仮
			throw new RuntimeException();
		}
	}


	@Override
	public OAuth2Token refreshToken() {
		// this.token = token;
		throw new UnsupportedOperationException("Unimplemented method 'refreshToken'");
	}
}
