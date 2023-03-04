package jp.kurages.discord.types.guild;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExplicitContentFilterLevel {
	DISABLED(0),
	MEMBERS_WITHOUT_ROLES(1),
	ALL_MEMBERS(2);

	private int value;
}
