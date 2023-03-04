package jp.kurages.discord.types.users;

import jp.kurages.discord.types.Snowflake;

public class User {
	Snowflake id;
	String username;
	String discriminator;
	String avatar;
	Boolean bot;
	Boolean system;
	Boolean mfaEnabled;
	String banner;
	Integer accentColor;
	String locale;
	Boolean verified;
	String email;
	UserFlags flags;
	PremiumTypes premiumType;
	UserFlags publicFlags;
}
