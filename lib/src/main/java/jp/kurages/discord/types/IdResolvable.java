package jp.kurages.discord.types;

import java.time.LocalDateTime;

public class IdResolvable {
	public Snowflake id;

	LocalDateTime createdAt() {
		return id.getTime();
	}
}
