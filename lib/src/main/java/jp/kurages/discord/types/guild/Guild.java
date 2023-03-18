package jp.kurages.discord.types.guild;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.permissions.Role;
import jp.kurages.discord.types.sticker.Sticker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Guild {
	Snowflake id;
	String name;
	String icon;
	String iconHash;
	String splash;
	String discoverySplash;
	Boolean owner;
	Snowflake ownerId;
	String permissions;
	String region;
	Snowflake afkChannelId;
	Integer afkTimeout;
	Boolean widgetEnabled;
	Snowflake widgetChannelId;
	Integer verificationLevel;
	Integer defaultMessageNotifications;
	Integer explicitContentFilter;
	Role[] roles;
	GuildFeatures[] features;
	Integer mfaLevel;
	Snowflake applicationId;
	Snowflake systemChannelId;
	Integer systemChannelFlags;
	Snowflake rulesChannelId;
	Integer maxPresences;
	Integer maxMembers;
	String vanityUrlCode;
	String description;
	String banner;
	Integer premiumTier;
	Integer premiumSubscriptionCount;
	String preferredLocale;
	Snowflake publicUpdatesChannelId;
	Integer maxVideoChannelUsers;
	Integer approximateMemberCount;
	Integer approximatePresenceCount;
	WelcomeScreen welcomeScreen;
	Integer nsfwLevel;
	Sticker[] stickers;
	Boolean premiumProgressBarEnabled;
}
