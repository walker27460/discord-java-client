package jp.kurages.discord.types.guild;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GuildMemberFlags {
	DID_REJOIN(1 << 0),
	COMPLETED_ONBOARDING(1 << 1),
	BYPASSES_VERIFICATION(1 << 2),
	STARTED_ONBOARDING(1 << 3);

	private int value;
}
