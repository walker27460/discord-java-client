package jp.kurages.discord.types.guild;

import java.util.Date;

import jp.kurages.discord.types.application.Application;
import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import jp.kurages.discord.types.users.User;

public class Integration {
	Snowflake id;
	String name;
	String type;
	Boolean enabled;
	Boolean syncing;
	Snowflake roleId;
	Boolean enableEmoticons;
	IntegrationExpireBehaviors expireBehavior;
	Integer expireGracePeriod;
	User user;
	IntegrationAccount account;
	Date syncedAt;
	Integer subscriberCount;
	Boolean revoked;
	Application application;
	OAuth2Scopes[] scopes;
}
