package jp.kurages.discord.types.guild.template;

import java.util.Date;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.guild.Guild;
import jp.kurages.discord.types.users.User;

public class GuildTemplate {
	String code;
	String name;
	String description;
	Integer usageCount;
	Snowflake creatorId;
	User creator;
	Date createdAt;
	Date updatedAt;
	Snowflake sourceGuildId;
	Guild serializedSourceGuild;
	Boolean isDirty;
}
