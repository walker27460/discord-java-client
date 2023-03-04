package jp.kurages.discord.types.sticker;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.users.User;

public class Sticker {
	Snowflake id;
	Snowflake packId;
	String name;
	String description;
	String tags;
	String asset;
	Integer type;
	Integer formatType;
	Boolean available;
	Snowflake guildId;
	User user;
	Integer sortValue;
}
