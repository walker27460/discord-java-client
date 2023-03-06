package jp.kurages.discord.client.oauth2;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import jp.kurages.discord.client.Token;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class OAuth2Token implements Token {
	private final String accessToken;
	private final String tokenType;
	private final Integer expiresIn;
	private final String refreshToken;
	private final String scope;

	private final LocalTime expires;

	public OAuth2Token(String accessToken, String tokenType,
		Integer expiresIn, String refreshToken, String scope
	){
		this.accessToken = accessToken;
		this.tokenType = tokenType;
		this.expiresIn = expiresIn;
		this.refreshToken = refreshToken;
		this.scope = scope;

		expires = LocalTime.now().plusSeconds(expiresIn);
	}

	public String getToken(){
		return new StringBuilder()
			.append(tokenType)
			.append(StringUtils.SPACE)
			.append(accessToken)
			.toString();
	}

	public List<OAuth2Scopes> getScopes(){
		return Stream.of(StringUtils.split(this.scope, StringUtils.SPACE))
			.map(OAuth2Scopes::of)
			.collect(Collectors.toList());
	}

	public boolean checkScope(OAuth2Scopes scope){
		if(StringUtils.isBlank(this.scope)){
			return false;
		}
		return this.scope.contains(scope.getValue());
	}

	@Override
	public boolean checkRefreshToken() {
		return expires.isAfter(LocalTime.now());
	}
}
