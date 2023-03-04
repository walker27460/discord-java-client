package jp.kurages.discord.types.guild;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MutableGuildFeatures {
	COMMUNITY("Administrator"),
	INVITES_DISABLED("Manage Guild"),
	DISCOVERABLE("Administrator*");

	private String value;
}
