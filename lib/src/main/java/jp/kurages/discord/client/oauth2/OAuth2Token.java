package jp.kurages.discord.client.oauth2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import jp.kurages.discord.client.Token;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder
@RequiredArgsConstructor
public class OAuth2Token implements Token {
	private final String accessToken;
	private final String tokenType;
	private final String expiresIn;
	private final String refreshToken;
	private final String scope;

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
}
