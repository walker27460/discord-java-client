package jp.kurages.discord.services;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.types.channel.Channel;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;


public class ChannelService extends CreatableService<Channel> {
	public ChannelService(Client client) {
		super(client);
	}

	String endpoint(String id) {
		return Endpoints.channels(id);
	}

	String endpoint() {
		return Endpoints.channels();
	}

	Class<Channel> holds() {
		return Channel.class;
	}

}
