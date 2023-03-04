package jp.kurages.discord.utils;

import java.lang.reflect.Type;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.utils.json.serializer.SnowflakeSerializer;

public class JsonUtil {
	private static final Gson gson = new GsonBuilder()
		.serializeNulls()
		.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
		.registerTypeAdapter(Snowflake.class, new SnowflakeSerializer())
		.create();

	public static <T> T fromJson(String json, Class<T> classofT){
		System.out.println("fromJson("+json+");");
		return gson.fromJson(json, classofT);
	}

	public <T> T fromJson(String json, Type typeOfT) throws JsonSyntaxException {
		return gson.fromJson(json, typeOfT);
	}

	public static String toJson(Object src){
		return gson.toJson(src);
	}

	public String toJson(Object src, Type typeOfSrc) {
		return gson.toJson(src, typeOfSrc);
	}
}
