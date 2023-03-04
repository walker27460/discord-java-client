package jp.kurages.discord.types.invite;

import java.util.Date;

import jp.kurages.discord.types.application.Application;
import jp.kurages.discord.types.channel.Channel;
import jp.kurages.discord.types.guild.Guild;
import jp.kurages.discord.types.guild.scheduled.event.GuildScheduledEvent;
import jp.kurages.discord.types.users.User;

public class Invite {
	String code;
	Guild guild;
	Channel channel;
	User inviter;
	Integer targetType;
	User targetUser;
	Application targetApplication;
	Integer approximatePresenceCount;
	Integer approximateMemberCount;
	Date expiresAt;
	InviteStageInstance stageInstance;
	GuildScheduledEvent guildScheduledEvent;
}
