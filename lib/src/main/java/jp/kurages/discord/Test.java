package jp.kurages.discord;

import jp.kurages.discord.client.bot.BotClient;
import jp.kurages.discord.domain.GuildId;
import jp.kurages.discord.services.GuildService;
import jp.kurages.discord.services.ServiceException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
	public static void main(String... args) throws ServiceException{
		BotClient cl = new BotClient(
			System.getenv("DISCORD_CLIENT_ID"),
			System.getenv("DISCORD_BOT_TOKEN")
		);

		GuildService guildService = cl.getGuildService();
		log.debug("{}", guildService.getGuild(new GuildId("1007952914368704622")));

	}

	@Getter
	@Setter
	@ToString
	@AllArgsConstructor
	public static class AAA {
		private String a;
		private String b;
		private String c;
	}

	@Getter
	@Setter
	@ToString
	@AllArgsConstructor
	public static class BBB {
		private AAA[] a;
	}
}
