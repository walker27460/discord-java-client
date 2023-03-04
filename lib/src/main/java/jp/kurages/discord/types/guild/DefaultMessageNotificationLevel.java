package jp.kurages.discord.types.guild;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DefaultMessageNotificationLevel {
	ALL_MESSAGES(0),
	ONLY_MENTIONS(1);

	private int value;
}
