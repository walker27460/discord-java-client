package jp.kurages.discord.types.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Services {
	BATTLE_NET("battlenet"),
	EBAY("ebay"),
	EPIC_GAMES("epicgames"),
	FACEBOOK("facebook"),
	GITHUB("github"),
	INSTAGRAM("instagram"),
	LEAGUE_OF_LEGENDS("leagueoflegends"),
	PAYPAL("paypal"),
	PLAYSTATION_NETWORK("playstation"),
	REDDIT("reddit"),
	RIOT_GAMES("riotgames"),
	SPOTIFY("spotify"),
	SKYPE("skype"),
	STEAM("steam"),
	TIKTOK("tiktok"),
	TWITCH("twitch"),
	TWITTER("twitter"),
	XBOX("xbox"),
	YOUTUBE("youtube");

	private String value;
}
