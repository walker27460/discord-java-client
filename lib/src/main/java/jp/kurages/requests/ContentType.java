package jp.kurages.requests;

import org.apache.commons.lang3.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * コンテンツタイプ
 */
@Getter
@AllArgsConstructor
public enum ContentType {
	MULTI_PART("multipart/form-data"),
	FORM_URLENCODED("application/x-www-form-urlencoded"),
	APPLIACTION_JSON("application/json");

	private String value;

	public static ContentType of(String value){
		if(StringUtils.isBlank(value)){
			return APPLIACTION_JSON;
		}
		for (ContentType contentType : ContentType.values()) {
			if(contentType.getValue().equals(value)){
				return contentType;
			}
		}
		throw new IllegalArgumentException(value+" is not found in ContentType");
	}

	public boolean equals(String value){
		return this.getValue().equals(value);
	}
}
