package jp.kurages.discord.types.webhooks;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.channel.Channel;
import jp.kurages.discord.types.guild.Guild;
import jp.kurages.discord.types.users.User;

public class Webhook {
	Snowflake id;
	Integer type;
	Snowflake guildId;
	Snowflake channelId;
	User user;
	String name;
	String avatar;
	Snowflake applicationId;
	Guild sourceGuild;
	Channel sourceChannel;
	String url;
}
