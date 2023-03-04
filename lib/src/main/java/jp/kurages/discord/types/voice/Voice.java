package jp.kurages.discord.types.voice;

import java.util.Date;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.guild.GuildMember;

public class Voice {
	Snowflake guildId;
	Snowflake channelId;
	Snowflake userId;
	GuildMember member;
	String sessionId;
	Boolean deaf;
	Boolean mute;
	Boolean selfDeaf;
	Boolean selfMute;
	Boolean selfStream;
	Boolean selfVideo;
	Boolean suppress;
	Date requestToSpeakTimestamp;
}
