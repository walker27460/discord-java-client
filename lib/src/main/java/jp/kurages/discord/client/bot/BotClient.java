package jp.kurages.discord.client.bot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.client.Token;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import jp.kurages.discord.types.permissions.BitwisePermission;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BotClient implements Client {
	private final String clientId;
	private final String token;

	/**
	 * Bot追加用URL
	 * @return URL
	 */
	public String getURL(Collection<OAuth2Scopes> scopes, Collection<BitwisePermission> permissions){
		StringBuilder sb = new StringBuilder(Endpoints.AUTHORIZATION)
			.append("?client_id=").append(clientId);
		if(!scopes.isEmpty()){
			sb.append("&scope=").append(OAuth2Scopes.getURLScopes(scopes));
		}
		if(!permissions.isEmpty()){
			sb.append("&permissions=").append(BitwisePermission.calculationScope(permissions));
		}
		return sb.toString();
	}

	/**
	 * guildId指定Bot追加用URL
	 * @param guildId ギルドid
	 * @param disableGuildSelect 指定のギルドidを強制する
	 * @return URL
	 */
	public String getURL(List<OAuth2Scopes> scopes, List<BitwisePermission> permissions, String guildId, boolean disableGuildSelect){
		return new StringBuilder(getURL(scopes, permissions))
			.append("&guild_id=").append(guildId)
			.append("&disable_guild_select=").append(disableGuildSelect)
			.toString();
	}

	@Override
	public void exchangeCode() {
	}

	@Override
	public Token getToken() {
		return new BotToken(token);
	}

}
