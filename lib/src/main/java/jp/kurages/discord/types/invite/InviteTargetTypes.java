package jp.kurages.discord.types.invite;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InviteTargetTypes {
	STREAM(1),
	EMBEDDED_APPLICATION(2);

	private int value;
}
