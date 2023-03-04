package jp.kurages.discord.types.guild;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PremiumTier {
	NONE(0),
	TIER_1(1),
	TIER_2(2),
	TIER_3(3);

	private int value;
}
