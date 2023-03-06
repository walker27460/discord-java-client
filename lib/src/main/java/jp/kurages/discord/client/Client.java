package jp.kurages.discord.client;

public interface Client {
	/**
	 * 実際のトークン取得処理
	 */
	void exchangeCode();

	/**
	 * トークンオブジェクト取得
	 * @return ログイン処理済みトークンオブジェクト
	 */
	Token getToken();

	/**
	 * トークンをリフレッシュする。
	 * 永続トークンの場合は実装不要
	 * @return リフレッシュ後のトークンオブジェクト
	 */
	default Token refreshToken(){
		throw new UnsupportedOperationException("Unimplemented method 'tokenRefresh'");
	}
}
