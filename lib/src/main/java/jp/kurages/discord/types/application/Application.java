package jp.kurages.discord.types.application;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.teams.Team;
import jp.kurages.discord.types.users.User;

public class Application {
	Snowflake id;
	String name;
	String icon;
	String description;
	String[] rpcOrigins;
	Boolean botPublic;
	Boolean botRequireCodeGrant;
	String termsOfServiceUrl;
	String privacyPolicyUrl;
	User owner;
	String summary;
	String verifyKey;
	Team team;
	Snowflake guildId;
	Snowflake primarySkuId;
	String slug;
	String coverImage;
	Integer flags;
	String[] tags;
	InstallParams installParams;
	String customInstallUrl;
	String roleConnectionsVerificationUrl;
}
