package jp.kurages.discord.types.guild;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.emoji.Emoji;
import jp.kurages.discord.types.sticker.Sticker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GuildPreview {
	Snowflake id;
	String name;
	String icon;
	String splash;
	String discoverySplash;
	Emoji[] emojis;
	GuildFeatures[] features;
	Integer approximateMemberCount;
	Integer approximatePresenceCount;
	String description;
	Sticker[] stickers;
}
