package jp.kurages.discord.client.bot;

import java.util.List;

import jp.kurages.discord.client.Token;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BotToken implements Token {
	private final String token;
	private final List<OAuth2Scopes> scopes;

	/** {@inheritDoc} */
	@Override
	public boolean checkScope(OAuth2Scopes scope) {
		return scopes.contains(scope);
	}

	/** {@inheritDoc} */
	@Override
	public boolean checkRefreshToken() {
		return false;
	}

}
