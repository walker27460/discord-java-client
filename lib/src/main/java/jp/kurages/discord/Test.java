package jp.kurages.discord;

import jp.kurages.discord.client.bot.BotClient;
import jp.kurages.discord.domain.GuildId;
import jp.kurages.discord.services.ServiceException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
	public static void main(String... args) throws ServiceException{
		log.debug(System.getenv("DISCORD_CLIENT_ID"));
		BotClient cl = new BotClient(
			System.getenv("DISCORD_CLIENT_ID"),
			System.getenv("DISCORD_BOT_TOKEN")
		);

		System.out.println(cl.getUserService().getCurrentUser());
		System.out.println(cl.getUserService()
			.leaveGuild(new GuildId("1007952914368704622"))
		);
	}
}
