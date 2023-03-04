package jp.kurages.discord.types.guild.scheduled.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GuildScheduledEventStatus {
	SCHEDULED(1),
	ACTIVE(2),
	COMPLETED(3),
	CANCELED(4);

	private int value;
}
