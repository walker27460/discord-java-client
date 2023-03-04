package jp.kurages.discord.types.audit.logs;

import jp.kurages.discord.types.Snowflake;

public class OptionalAuditEntryInfo {
	Snowflake applicationId;
	String autoModerationRuleName;
	String autoModerationRuleTriggerType;
	Snowflake channelId;
	String count;
	String deleteMemberDays;
	Snowflake id;
	String membersRemoved;
	Snowflake messageId;
	String roleName;
	String type;
}
