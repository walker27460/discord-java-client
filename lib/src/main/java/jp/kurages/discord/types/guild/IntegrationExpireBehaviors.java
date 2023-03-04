package jp.kurages.discord.types.guild;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * https://discord.com/developers/docs/resources/guild#integration-object-integration-expire-behaviors
 */
@Getter
@AllArgsConstructor
public enum IntegrationExpireBehaviors {
	REMOVE_ROLE(0),
	KICK(1);

	private int value;
}
