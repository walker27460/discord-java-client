package jp.kurages.discord.client;

import java.util.List;

import jp.kurages.discord.types.oauth2.OAuth2Scopes;

/**
 * トークン保持用構造体。
 * リフレッシュもここでする(と思う)
 */
public interface Token {
	/**
	 * Tokenタイプも含めたトークン文字列
	 */
	String getToken();

	/**
	 * 認可されたスコープリスト
	 */
	List<OAuth2Scopes> getScopes();

	/**
	 * 引数のスコープが利用可能かどうか。
	 * @param scope 判定するスコープ
	 * @return 使用可能ならtrue
	 */
	boolean checkScope(OAuth2Scopes scope);
}
