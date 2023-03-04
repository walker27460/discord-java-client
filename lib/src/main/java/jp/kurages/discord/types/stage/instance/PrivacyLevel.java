package jp.kurages.discord.types.stage.instance;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PrivacyLevel {
	PUBLIC(1),
	GUILD_ONLY(2);

	private int value;
}
