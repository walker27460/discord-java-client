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

	@Override
	public String getToken() {
		return "Bot " + token;
	}

	@Override
	public List<OAuth2Scopes> getScopes() {
		throw new UnsupportedOperationException("Unimplemented method 'getScopes'");
	}

	/** {@inheritDoc} */
	@Override
	public boolean checkScope(OAuth2Scopes scope) {
		return true;
	}

	/** {@inheritDoc} */
	@Override
	public boolean checkRefreshToken() {
		return false;
	}
}
