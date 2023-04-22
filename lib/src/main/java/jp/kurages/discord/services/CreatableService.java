package jp.kurages.discord.services;

import com.google.gson.JsonObject;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.types.IdResolvable;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class CreatableService<T extends IdResolvable> extends Service<T>{
	public CreatableService(Client client) {
		super(client);
	}
	@Override
	abstract Class<T> holds();

	abstract String endpoint();

	private HttpRequest createRequest(String name) throws URISyntaxException {
		return HttpRequest.newBuilder()
			.header("Authorization", this.client.getToken())
			.header("Content-Type", "application/json")
			.POST(HttpRequest.BodyPublishers.ofString("{\"name\": \"" + name + "\"}"))
			.uri(new URI(this.endpoint()))
			.build();
	}
	public T create(String name) throws URISyntaxException, IOException, InterruptedException, DiscordAPIException {
		var resp = this.client.http.send(this.createRequest(name), HttpResponse.BodyHandlers.ofString());
		if(resp.statusCode() >= 400) {
			var json = this.client.gson.fromJson(resp.body(), JsonObject.class);
			throw new DiscordAPIException(json.get("message").getAsString());
		} else {
			var value = this.client.gson.fromJson(resp.body(), this.holds());
			this.set(value);
			return value;
		}
	}
}


