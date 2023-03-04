package jp.kurages.discord.types.guild.scheduled.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GuildScheduledEventPrivacyLevel {
	GUILD_ONLY(2);

	private int value;
}
