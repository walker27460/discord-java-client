package jp.kurages.discord.types.channel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SortOrderTypes {
	LATEST_ACTIVITY(0),
	CREATION_DATE(1);

	private int value;
}
