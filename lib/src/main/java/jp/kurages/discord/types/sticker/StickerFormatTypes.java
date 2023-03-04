package jp.kurages.discord.types.sticker;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StickerFormatTypes {
	PNG(1),
	APNG(2),
	LOTTIE(3),
	GIF(4);

	private int value;
}
