package jp.kurages.discord.services;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.domain.GuildId;
import jp.kurages.discord.domain.UserId;
import jp.kurages.discord.types.guild.Guild;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import jp.kurages.discord.types.users.User;
import jp.kurages.requests.HttpMethod;
import jp.kurages.discord.utils.JsonUtil;

public class UserService extends Service {
	/** ログイン中のユーザ取得 {@value} */
	public static final String CURRENT_USER = Endpoints.BASE_API + "/users/@me";
	/** ユーザー取得 1:user id {@value} */
	public static final String GET_USER = Endpoints.BASE_API + "/users/{user.id}";
	/** ログイン中のユーザーがメンバーのギルド */
	public static final String CURRENT_USER_GUILDS = Endpoints.BASE_API + "/users/@me/guilds";
	/** ログイン中のユーザーがメンバーのギルドのメンバー */
	public static final String CURRENT_USER_GUILD_MEMBER = Endpoints.BASE_API + "/users/@me/guilds/{guild.id}/member";

	public static final String LEAVE_GUILD = Endpoints.BASE_API + "/users/@me/guilds/{guild.id}";

	public UserService(Client client) {
		super(client);
	}

	public User getCurrentUser() throws ServiceException{
		isExecutable(OAuth2Scopes.IDENTIFY);
		return JsonUtil.fromJson(
			sendRequest(CURRENT_USER, HttpMethod.GET),
			User.class
		);
	}

	public User getUser(UserId userId) throws ServiceException{
		isExecutable();
		return JsonUtil.fromJson(
			sendRequest(userId.format(GET_USER), HttpMethod.GET),
			User.class
		);
	}

	public Guild[] getCurrentUserGuilds() throws ServiceException{
		isExecutable(OAuth2Scopes.GUILDS);
		return JsonUtil.fromJson(
			sendRequest(CURRENT_USER_GUILDS, HttpMethod.DELETE),
			Guild[].class
		);
	}

	public String leaveGuild(GuildId guildId) throws ServiceException{
		isExecutable();
		return sendRequest(guildId.format(LEAVE_GUILD), HttpMethod.DELETE);
	}

	public Guild getCurrentUserGuildMember(GuildId guildId) throws ServiceException{
		isExecutable(OAuth2Scopes.GUILDS_MEMBERS_READ);
		return JsonUtil.fromJson(
			sendRequest(
				guildId.format(CURRENT_USER_GUILD_MEMBER),
				HttpMethod.GET
			),
			Guild.class
		);
	}

}
