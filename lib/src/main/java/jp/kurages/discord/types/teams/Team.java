package jp.kurages.discord.types.teams;

import jp.kurages.discord.types.Snowflake;

public class Team {
	String icon;
	Snowflake id;
	TeamMember[] members;
	String name;
	Snowflake ownerUserId;
}
