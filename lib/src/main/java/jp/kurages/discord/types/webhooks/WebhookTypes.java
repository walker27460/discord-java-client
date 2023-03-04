package jp.kurages.discord.types.webhooks;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WebhookTypes {
	INCOMING(1),
	CHANNEL_FOLLOWER(2),
	APPLICATION(3);

	private int value;
}
