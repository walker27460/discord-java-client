package jp.kurages.discord.services;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.domain.GuildId;
import jp.kurages.discord.types.guild.Guild;
import jp.kurages.discord.types.guild.GuildPreview;
import jp.kurages.discord.utils.JsonUtil;
import jp.kurages.requests.HttpMethod;

public class GuildService extends Service {
	public static final String GET_GUILD = Endpoints.BASE_API + "/guilds/{guild.id}";
	public static final String GET_GUILD_PREVIEW = Endpoints.BASE_API + "/guilds/{guild.id}/preview";


	public GuildService(Client client) {
		super(client);
	}

	public Guild getGuild(GuildId guildId) throws ServiceException{
		return JsonUtil.fromJson(
			sendRequest(
				guildId.format(GET_GUILD),
				HttpMethod.GET
			),
			Guild.class
		);
	}

	public GuildPreview getGuildPreview(GuildId guildId) throws ServiceException{
		return JsonUtil.fromJson(
			sendRequest(
				guildId.format(GET_GUILD_PREVIEW),
				HttpMethod.GET
			),
			GuildPreview.class
		);
	}

}
