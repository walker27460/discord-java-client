package jp.kurages.discord.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Domain<T> {
	private final T value;
	private final String formatString;

	public String format(String str){
		String result = str.replace(formatString, toString());
		System.out.println("result: "+ result);
		return result;
	}

	public String toString(){
		return value.toString();
	}
}
