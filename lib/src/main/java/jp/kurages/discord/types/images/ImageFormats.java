package jp.kurages.discord.types.images;

import lombok.Getter;

/**
 * https://discord.com/developers/docs/reference#image-formatting-image-formats
 */
@Getter
public enum ImageFormats {
	JPEG(".jpg", ".jpeg"),
	PNG(".png"),
	WEB_P(".webp"),
	GIF(".gif"),
	LOTTIE(".json");

	private String[] args;
	ImageFormats(String... args){
		this.args = args;
	}
}
