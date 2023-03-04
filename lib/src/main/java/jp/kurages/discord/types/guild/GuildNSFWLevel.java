package jp.kurages.discord.types.guild;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GuildNSFWLevel {
	DEFAULT(0),
	EXPLICIT(1),
	SAFE(2),
	AGE_RESTRICTED(3);

	private int value;
}
