package jp.kurages.discord.types.users;

/**
 * https://discord.com/developers/docs/resources/user#connection-object-connection-structure
 */
public class Connection {
	String id;
	String name;
	String type;
	Boolean revoked;
	Integration[] integrations;
	Boolean verified;
	Boolean friendSync;
	Boolean showActivity;
	Boolean twoWayLink;
	VisibilityTypes visibility;
}
