package jp.kurages.discord.types.application.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApplicationCommandType {
	CHAT_INPUT(1),
	USER(2),
	MESSAGE(3);

	private int value;
}
