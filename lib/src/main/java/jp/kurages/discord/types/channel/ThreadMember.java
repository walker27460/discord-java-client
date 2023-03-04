package jp.kurages.discord.types.channel;

import java.util.Date;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.guild.GuildMember;

public class ThreadMember {
	Snowflake id;
	Snowflake userId;
	Date joinTimestamp;
	Integer flags;
	GuildMember member;
}
