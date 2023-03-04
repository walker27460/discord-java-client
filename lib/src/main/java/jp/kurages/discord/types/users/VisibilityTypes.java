package jp.kurages.discord.types.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * https://discord.com/developers/docs/resources/user#connection-object-visibility-types
 */
@Getter
@AllArgsConstructor
public enum VisibilityTypes {
	NONE(0),
	EVERYONE(1);

	private int value;
}
