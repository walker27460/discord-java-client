package jp.kurages.discord.types.guild.scheduled.event;

import java.util.Date;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.users.User;

public class GuildScheduledEvent {
	Snowflake id;
	Snowflake guildId;
	Snowflake channelId;
	Snowflake creatorId;
	String name;
	String description;
	Date scheduledStartTime;
	Date scheduledEndTime;
	GuildScheduledEventPrivacyLevel privacyLevel;
	GuildScheduledEventStatus status;
	GuildScheduledEventEntityType entityType;
	Snowflake entityId;
	GuildScheduledEventEntityMetadata entityMetadata;
	User creator;
	Integer userCount;
	String image;
}
