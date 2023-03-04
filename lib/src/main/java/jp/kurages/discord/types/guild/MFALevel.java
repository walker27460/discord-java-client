package jp.kurages.discord.types.guild;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MFALevel {
	NONE(0),
	ELEVATED(1);

	private int value;
}
