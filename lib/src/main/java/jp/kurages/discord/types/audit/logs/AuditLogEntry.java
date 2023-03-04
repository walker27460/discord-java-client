package jp.kurages.discord.types.audit.logs;

import jp.kurages.discord.types.Snowflake;

public class AuditLogEntry {
	String targetId;
	AuditLogChange changes;
	Snowflake userId;
	Snowflake id;
	AuditLogEvents actionType;
	OptionalAuditEntryInfo options;
	String reason;
}
