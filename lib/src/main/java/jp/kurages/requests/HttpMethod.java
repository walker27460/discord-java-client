package jp.kurages.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HttpMethod {
	GET("GET", EncodeMode.PARAM),
	POST("POST", EncodeMode.DATA),
	PUT("GET", EncodeMode.DATA),
	DELETE("GET", EncodeMode.PARAM),
	PATCH("PATCH", EncodeMode.DATA);

	private String method;
	private EncodeMode mode;

	protected static enum EncodeMode {
		PARAM,
		DATA;
	}
}
