package jp.kurages.discord.types.guild;

import java.util.Date;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.users.User;

public class GuildMember {
	User user;
	String nick;
	String avatar;
	Snowflake[] roles;
	Date joinedAt;
	Date premiumSince;
	Boolean deaf;
	Boolean mute;
	Integer flags;
	Boolean pending;
	String permissions;
	Date communicationDisabledUntil;
}
