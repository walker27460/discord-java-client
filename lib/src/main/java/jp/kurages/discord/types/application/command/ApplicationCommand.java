package jp.kurages.discord.types.application.command;

import jp.kurages.discord.types.Locales;
import jp.kurages.discord.types.Snowflake;

public class ApplicationCommand {
	Snowflake id;
	ApplicationCommandType type;
	Snowflake applicationId;
	Snowflake guildId;
	String name;
	Locales nameLocalizations;
	String description;
	Locales descriptionLocalizations;
	ApplicationCommandOption options;
	String defaultMemberPermissions;
	Boolean dmPermission;
	Boolean defaultPermission;
	Boolean nsfw;
	Snowflake version;
}
