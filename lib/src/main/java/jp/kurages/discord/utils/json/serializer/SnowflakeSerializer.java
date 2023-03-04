package jp.kurages.discord.utils.json.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import jp.kurages.discord.types.Snowflake;

public class SnowflakeSerializer implements JsonSerializer<Snowflake>, JsonDeserializer<Snowflake> {
	@Override
	public Snowflake deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		return new Snowflake(json.getAsJsonPrimitive().getAsLong());
	}

	@Override
	public JsonElement serialize(Snowflake src, java.lang.reflect.Type typeOfSrc, JsonSerializationContext context) {
		return new JsonPrimitive(src.getValue());
	}

}
