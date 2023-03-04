package jp.kurages.discord.types.permissions;

import jp.kurages.discord.types.Snowflake;

public class Role {
	Snowflake id;
	String name;
	Integer color;
	Boolean hoist;
	String icon;
	String unicodeEmoji;
	Integer position;
	String permissions;
	Boolean managed;
	Boolean mentionable;
	RoleTags[] tags;
}
