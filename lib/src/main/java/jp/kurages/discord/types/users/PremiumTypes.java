package jp.kurages.discord.types.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PremiumTypes {
	NONE(0),
	NITRO_CLASSIC(1),
	NITRO(2),
	NITRO_BASIC(3);

	private Integer value;
}
