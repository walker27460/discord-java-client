package jp.kurages.discord.services;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Token;
import jp.kurages.discord.types.guild.Guild;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import jp.kurages.discord.types.users.User;
import jp.kurages.requests.HttpMethod;
import jp.kurages.discord.utils.JsonUtil;

public class UserService extends Base {
	/** ログイン中のユーザ取得 {@value} */
	public static final String CURRENT_USER = Endpoints.BASE_API + "/users/@me";
	public static final String CURRENT_USER_GUILDS = Endpoints.BASE_API + "/users/@me/guilds";
	public static final String CURRENT_USER_GUILD_MEMBER = Endpoints.BASE_API + "/users/@me/guilds/{0}/member";

	public UserService(Token token) {
		super(token);
	}

	public User getCurrentUser(){
		checkScopes(OAuth2Scopes.IDENTIFY);
		return JsonUtil.fromJson(
			getRequest(CURRENT_USER, HttpMethod.GET),
			User.class
		);
	}

	public Guild[] getCurrentUserGuilds(){
		checkScopes(OAuth2Scopes.GUILDS);
		return JsonUtil.fromJson(
			getRequest(CURRENT_USER_GUILDS, HttpMethod.GET),
			Guild[].class
		);
	}

	public Guild getCurrentUserGuildMember(String guildId){
		checkScopes(OAuth2Scopes.GUILDS_MEMBERS_READ);
		return JsonUtil.fromJson(
			getRequest(
				format(CURRENT_USER_GUILD_MEMBER, guildId),
				HttpMethod.GET
			),
			Guild.class
		);
	}

}
