package jp.kurages.discord.client;

import jp.kurages.discord.services.UserService;

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

	/**
	 * @return ユーザーサービス
	 */
	default UserService getUserService(){
		return new UserService(this);
	}
}
