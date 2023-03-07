package jp.kurages.discord;

public class Endpoints {
	public static final String BASE_API = "https://discord.com/api/v10";
	/** 認証URL {@value} */
	public static final String AUTHORIZATION = "https://discord.com/oauth2/authorize";

	/** CDN URL {@value} */
	public static final String CDN_URL = "https://cdn.discordapp.com";

	/** CDN アバター取得URL 0: userId 1: avatarHash */
	public static final String AVATAR_URL = CDN_URL + "/avatars/{0}/{1}";

	// auth
	/** OAuth2 Token取得 {@value} */
	public static final String TOKEN_URL = BASE_API + "/oauth2/token";
	/** OAuth2 Token破棄 */
	public static final String TOKEN_REVOKE_URL = BASE_API + "/oauth2/token/revoke";
}
