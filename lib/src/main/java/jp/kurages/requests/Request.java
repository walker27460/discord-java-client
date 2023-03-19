package jp.kurages.requests;

import java.net.URLEncoder;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import jp.kurages.requests.utils.JsonUtil;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

@Getter
@Setter
@Builder
public class Request {
	private static final String EQUAL = "=";
	private static final String AMPERSAND = "&";
	private static final String QUESTION_MARK = "?";
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String USER_AGENT = "user-agent";

	private final String baseUrl;
	private final HttpMethod method;

	@Singular("headers")
	private final Map<String, String> headers;

	@Singular("data")
	private final Map<String, String> data;

	public String getUrl(){
		switch(method){
			case GET:
			case DELETE:
				if(data.size() > 0){
					return baseUrl + QUESTION_MARK + urlEncode();
				}else{
					return baseUrl;
				}
			default:
				return baseUrl;
		}
	}

	public String urlEncode(){
		if(data.size() == 0){
			return StringUtils.EMPTY;
		}
		StringBuilder params = new StringBuilder();
		for (Map.Entry<String, String> param : data.entrySet()) {
			params.append(AMPERSAND)
			.append(URLEncoder.encode(
				param.getKey(),
				StandardCharsets.UTF_8
			))
			.append(EQUAL)
			.append(URLEncoder.encode(
				param.getValue(),
				StandardCharsets.UTF_8
			));
		}
		return params.substring(1).toString();
	}

	public BodyPublisher getBody(){
		switch(method){
			case DELETE:
			case GET:
				return BodyPublishers.noBody();
			default:
				if(getContentType() == ContentType.FORM_URLENCODED){
					return BodyPublishers.ofString(urlEncode());
				} else {
					return BodyPublishers.ofString(JsonUtil.toJson(data));
				}
		}
	}

	private ContentType getContentType(){
		return ContentType.of(headers.get(CONTENT_TYPE));
	}
}
