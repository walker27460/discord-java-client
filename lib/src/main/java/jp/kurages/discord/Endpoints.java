package jp.kurages.discord;

public class Endpoints {
	public static final String BASE_API = "https://discord.com/api/v10";
	/** 認証URL {@value} */
	public static final String AUTHORIZATION = "https://discord.com/oauth2/authorize";

	public static final String channels(String id) {
		return BASE_API + "/channels/" + id;
	}
	public static final String channels() {
		return BASE_API + "/channels";
	}
	public static final String users(String id) {
		return BASE_API + "/users/" + id;
	}
	public static final String users() {
		return BASE_API + "/users";
	}
	public static final String guilds(String id) {
		return BASE_API + "/guilds/" + id;
	}
	public static final String guilds() {
		return BASE_API + "/guilds";
	}
	/** CDN URL {@value} */
	public static final String CDN_URL = "https://cdn.discordapp.com";
	public static final String GATEWAY = "/gateway";
	public static final String GATEWAY_BOT = "/gateway/bot";

	// auth
	/** OAuth2 Token取得 {@value} */
	public static final String TOKEN_URL = BASE_API + "/oauth2/token";
	/** OAuth2 Token破棄 */
	public static final String TOKEN_REVOKE_URL = BASE_API + "/oauth2/token/revoke";

}
