package jp.kurages.discord.services;

import com.google.gson.JsonElement;

public class DiscordAPIException extends Exception {
	protected int code;
	protected String message;

	public DiscordAPIException(String message) {
		super(message);
	}
}
