package jp.kurages.discord.types.permissions;

import jp.kurages.discord.types.Snowflake;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoleTags {
	Snowflake botId;
	Snowflake integrationId;
	Object premiumSubscriber;
	Snowflake subscriptionListingId;
	Object availableForPurchase;
	Object guildConnections;
}
