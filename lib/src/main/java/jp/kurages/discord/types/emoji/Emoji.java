package jp.kurages.discord.types.emoji;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.permissions.Role;
import jp.kurages.discord.types.users.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Emoji {
	Snowflake id;
	String name;
	Role[] roles;
	User user;
	Boolean requireColons;
	Boolean managed;
	Boolean animated;
	Boolean available;
}
