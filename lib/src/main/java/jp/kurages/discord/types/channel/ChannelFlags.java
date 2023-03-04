package jp.kurages.discord.types.channel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChannelFlags {
	PINNED(1 << 1),
	REQUIRE_TAG(1 << 4);

	private int value;
}
