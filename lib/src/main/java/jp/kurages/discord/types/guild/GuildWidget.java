package jp.kurages.discord.types.guild;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.channel.Channel;
import jp.kurages.discord.types.users.User;

public class GuildWidget {
	Snowflake id;
	String name;
	String instantInvite;
	Channel[] channels;
	User[] members;
	Integer presenceCount;
}
