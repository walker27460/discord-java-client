package jp.kurages.discord.types.guild;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VerificationLevel {
	NONE(0),
	LOW(1),
	MEDIUM(2),
	HIGH(3),
	VERY_HIGH(4);

	private int value;
}
