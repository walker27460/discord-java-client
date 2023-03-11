package jp.kurages.discord.domain;

public class UserId extends Domain<String> {
	public static String FORMAT = "{user.id}";

	public UserId(String value) {
		super(value, FORMAT);
	}
}
