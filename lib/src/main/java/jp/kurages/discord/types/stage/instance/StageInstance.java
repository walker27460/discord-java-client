package jp.kurages.discord.types.stage.instance;

import jp.kurages.discord.types.Snowflake;

public class StageInstance {
	Snowflake id;
	Snowflake guildId;
	Snowflake channelId;
	String topic;
	Integer privacyLevel;
	Boolean discoverableDisabled;
	Snowflake guildScheduledEventId;
}
