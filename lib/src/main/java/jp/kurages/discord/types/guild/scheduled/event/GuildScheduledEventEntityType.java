package jp.kurages.discord.types.guild.scheduled.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GuildScheduledEventEntityType {
	STAGE_INSTANCE(1),
	VOICE(2),
	EXTERNAL(3);

	private int value;
}
