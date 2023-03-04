package jp.kurages.discord.types.audit.logs;

import jp.kurages.discord.types.application.command.ApplicationCommand;
import jp.kurages.discord.types.auto.moderation.AutoModerationRule;
import jp.kurages.discord.types.channel.Channel;
import jp.kurages.discord.types.guild.Integration;
import jp.kurages.discord.types.guild.scheduled.event.GuildScheduledEvent;
import jp.kurages.discord.types.users.User;
import jp.kurages.discord.types.webhooks.Webhook;

public class AuditLog {
	ApplicationCommand[] applicationCommands;
	AuditLogEntry[] auditLogEntries;
	AutoModerationRule[] autoModerationRules;
	GuildScheduledEvent[] guildScheduledEvents;
	Integration[] integrations;
	Channel[] threads;
	User[] users;
	Webhook webhooks;
}
