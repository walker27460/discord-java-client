package jp.kurages.discord.types.teams;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.users.User;

public class TeamMember {
	Integer membershipState;
	String[] permissions;
	Snowflake teamId;
	User user;
}
