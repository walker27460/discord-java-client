package jp.kurages.discord.types.teams;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MembershipState {
	INVITED(1),
	ACCEPTED(2);

	private int value;
}
