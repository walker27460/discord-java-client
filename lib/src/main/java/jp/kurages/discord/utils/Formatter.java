package jp.kurages.discord.utils;

import jp.kurages.discord.domain.Domain;

public class Formatter {
	public static String format(String str, Domain<?>... args){
		StringBuilder sb = new StringBuilder(str);
		for (Domain<?> arg : args) {
			int start = sb.indexOf(arg.getFormatString());
			int end = start + arg.getFormatString().length();
			sb.replace(start, end, arg.toString());
		}
		return sb.toString();
	}
}
