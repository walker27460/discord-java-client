package jp.kurages.discord.types.sticker;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StickerTypes {
	STANDARD(1),
	GUILD(2);

	private int value;
}
