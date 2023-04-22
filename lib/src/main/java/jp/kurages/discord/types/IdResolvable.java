package jp.kurages.discord.types;

import java.time.LocalDateTime;

import jp.kurages.discord.client.Client;

public class IdResolvable {
	protected final Client client;
	protected IdResolvable(Client client) {
		this.client = client;
	}


	public Snowflake id;

	LocalDateTime createdAt() {
		return id.getTime();
	}
}
