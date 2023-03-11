package jp.kurages.discord.domain;

public class GuildId extends Domain<String> {
	public static String FORMAT = "{guild.id}";

	public GuildId(String value) {
		super(value, FORMAT);
	}
}
