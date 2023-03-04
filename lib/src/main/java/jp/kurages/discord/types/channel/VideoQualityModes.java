package jp.kurages.discord.types.channel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VideoQualityModes {
	AUTO(1),
	FULL(2);

	private int value;
}
