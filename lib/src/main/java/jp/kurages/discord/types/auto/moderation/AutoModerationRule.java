package jp.kurages.discord.types.auto.moderation;

import jp.kurages.discord.types.Snowflake;

public class AutoModerationRule {
	Snowflake id;
	Snowflake guildId;
	String name;
	Snowflake creatorId;
	Integer eventType;
	Integer triggerType;
	Object triggerMetadata;
	AutoModerationAction[] actions;
	Boolean enabled;
	Snowflake[] exemptRoles;
	Snowflake[] exemptChannels;
}
