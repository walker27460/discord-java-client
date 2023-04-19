package jp.kurages.discord.services;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.domain.GuildId;
import jp.kurages.discord.domain.UserId;
import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.channel.Channel;
import jp.kurages.discord.types.guild.Guild;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import jp.kurages.discord.types.users.User;
import jp.kurages.requests.HttpMethod;
import jp.kurages.discord.utils.JsonUtil;

import javax.annotation.Nullable;
import java.util.concurrent.ConcurrentHashMap;

public class UserService extends Service<User> {
	/**
	 * @param client Client
	 */
	public UserService(Client client) {
		super(client);
	}

	public User getCurrentUser() throws Exception {
		return this.fetch("@me");
	}

	@Override
	String endpoint(String id) {
		return Endpoints.users(id);
	}
	@Override
	Class<User> holds() {
		return User.class;
	}
}
