package jp.kurages.discord.services;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.channel.Channel;
import jp.kurages.discord.types.guild.Guild;


public class ChannelService extends CreatableService<Channel> {
	public ChannelService(Client client) {
		super(client);
	}

	@Override
	String endpoint(String id) {
		return Endpoints.channels(id);
	}
	@Override
	String endpoint() {
		return Endpoints.channels();
	}

	@Override
	Class<Channel> holds() {
		return Channel.class;
	}
}
