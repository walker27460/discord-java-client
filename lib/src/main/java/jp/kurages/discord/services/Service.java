package jp.kurages.discord.services;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.MessageFormat;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Optional;

import com.google.gson.JsonObject;
import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.types.IdResolvable;
import jp.kurages.discord.types.Snowflake;
import jp.kurages.discord.types.oauth2.OAuth2Scopes;
import jp.kurages.requests.ContentType;
import jp.kurages.requests.HttpMethod;
import jp.kurages.requests.Request;
import jp.kurages.requests.Requests;
import lombok.AllArgsConstructor;

import javax.annotation.Nullable;

@AllArgsConstructor
public abstract class Service<T extends IdResolvable> {
	protected final Client client;
	protected ConcurrentHashMap<Snowflake, T> cache;
	public Service(Client client){
		this.client = client;
	}
	private void set(T value) {
		this.cache.put(value.id, value);
	}
	protected String format(String text, Object... args){
		return MessageFormat.format(text, args);
	}
	@Nullable
	public T get(Snowflake id) {
		return this.cache.get(id);
	}
	abstract String endpoint(String id);
	abstract Class<T> holds();

	abstract HttpRequest fetchRequest() throws URISyntaxException;

	public T fetch(String ids) throws DiscordAPIException, IOException, InterruptedException, URISyntaxException {
		HttpResponse<String> res = this.client.http.send(this.fetchRequest(), HttpResponse.BodyHandlers.ofString());
		if(res.statusCode() > 400) {
			JsonObject error = this.client.gson.fromJson(res.body(), JsonObject.class);
			throw new DiscordAPIException(error.get("message").getAsString());
		}
		T value = this.client.gson.fromJson(res.body(), this.holds());
		this.set(value);
		return value;
	}
	ConcurrentHashMap<Snowflake, T> valueOf() {
		return this.cache;
	}
}
