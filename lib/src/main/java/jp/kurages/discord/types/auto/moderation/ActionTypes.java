package jp.kurages.discord.types.auto.moderation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ActionTypes {
	BLOCK_MESSAGE(1),
	SEND_ALERT_MESSAGE(2),
	TIMEOUT(3);

	private int value;
}
