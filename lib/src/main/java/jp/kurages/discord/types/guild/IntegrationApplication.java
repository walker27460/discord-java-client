package jp.kurages.discord.types.guild;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.users.User;

/**
 * https://discord.com/developers/docs/resources/guild#integration-application-object-integration-application-structure
 */
public class IntegrationApplication {
	Snowflake id;
	String name;
	String icon;
	String description;
	User bot;
}
