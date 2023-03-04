package jp.kurages.discord.types.channel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ForumLayoutTypes {
	NOT_SET(0),
	LIST_VIEW(1),
	GALLERY_VIEW(2);

	private int value;
}
