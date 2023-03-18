package jp.kurages.discord.types.channel;

import java.util.Date;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.users.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Channel {
	Snowflake id;
	ChannelTypes type;
	Snowflake guildId;
	Integer position;
	Override permissionOverwrites;
	String name;
	String topic;
	Boolean nsfw;
	Snowflake lastMessageId;
	Integer bitrate;
	Integer userLimit;
	Integer rateLimitPerUser;
	User[] recipients;
	String icon;
	Snowflake ownerId;
	Snowflake applicationId;
	Boolean managed;
	Snowflake parentId;
	Date lastPinTimestamp;
	String rtcRegion;
	Integer videoQualityMode;
	Integer messageCount;
	Integer memberCount;
	ThreadMetadata threadMetadata;
	ThreadMember member;
	Integer defaultAutoArchiveDuration;
	String permissions;
	Integer flags;
	Integer totalMessageSent;
	ForumTag[] availableTags;
	Snowflake[] appliedTags;
	DefaultReaction defaultReactionEmoji;
	Integer defaultThreadRateLimitPerUser;
	Integer defaultSortOrder;
	Integer defaultForumLayout;
}
