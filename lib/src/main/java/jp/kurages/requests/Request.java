package jp.kurages.requests;

import java.net.URLEncoder;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.stream.Collectors;

import jp.kurages.requests.HttpMethod.EncodeMode;
import jp.kurages.requests.utils.JsonUtil;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Request {
	private static final String EQUAL = "=";
	private static final String AMPERSAND = "&";
	private static final String QUESTION_MARK = "?";
	public static final String CONTENT_TYPE = "Content-Type";

	private final String url;
	@Builder.Default
	private final String accept = ContentType.APPLIACTION_JSON.getValue();
	private final HttpMethod method;

	@Singular("headers")
	private final Map<String, String> headers;

	@Singular("params")
	private final Map<String, String> params;

	@Singular("data")
	private final Map<String, String> data;

	public String getUrl(){
		if(method.getMode() == EncodeMode.PARAM){
			return url + QUESTION_MARK + encode();
		}
		return url;
	}

	private String encode(){
		Map<String, String> value = method.getMode() == EncodeMode.PARAM ? params : data;
		if(method.getMode() == EncodeMode.PARAM
			|| ContentType.FORM_URLENCODED.equals(getContentType())
		){
			return value.entrySet().stream()
				.map(e -> e.getKey() + EQUAL + URLEncoder.encode(
					e.getValue(), StandardCharsets.UTF_8
				)
			).collect(Collectors.joining(AMPERSAND));
		} else if(method.getMode() == EncodeMode.DATA){
			return JsonUtil.toJson(value);
		}
		throw new IllegalArgumentException("not support EncodeMode");
	}

	public BodyPublisher getBodyPublisher(){
		return BodyPublishers.ofString(encode());
	}

	private String getContentType(){
		return headers.get(CONTENT_TYPE);
	}
}
