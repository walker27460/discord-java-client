package jp.kurages.discord.client.bot;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.client.Token;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import jp.kurages.discord.types.permissions.BitwisePermission;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BotClient implements Client<BotToken> {
	private final String clientId;
	private final List<OAuth2Scopes> scopes;
	private final List<BitwisePermission> permissions;

	private BotToken token;


	/**
	 * Bot追加用URL
	 * @return URL
	 */
	public String getURL(){
		return new StringBuilder()
			.append(Endpoints.AUTHORIZATION)
			.append("?client_id=").append(clientId)
			.append("&scope=").append(StringUtils.join(scopes, "%20"))
			.append("&permissions=").append(BitwisePermission.calculationScope(permissions))
			.toString();
	}

	/**
	 * guildId指定Bot追加用URL
	 * @param guildId ギルドid
	 * @param disableGuildSelect 指定のギルドidを強制する
	 * @return URL
	 */
	public String getURL(String guildId, boolean disableGuildSelect){
		return new StringBuilder(getURL())
			.append("&guild_id=").append(guildId)
			.append("&disable_guild_select=").append(disableGuildSelect)
			.toString();
	}

	@Override
	public void exchangeCode() {
	}

	@Override
	public Token getToken() {
		return token;
	}

}
