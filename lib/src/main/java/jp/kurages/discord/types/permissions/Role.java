package jp.kurages.discord.types.permissions;

import jp.kurages.discord.types.Snowflake;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
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
