package jp.kurages.discord.services;

import jp.kurages.discord.Endpoints;
import jp.kurages.discord.client.Client;
import jp.kurages.discord.types.IdResolvable;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

public abstract class CreatableService<T extends IdResolvable> extends Service<T>{
	public CreatableService(Client client) {
		super(client);
	}
	@Override
	abstract Class<T> holds();

	abstract String endpoint();

	private HttpRequest createRequest() throws URISyntaxException {
		HttpRequest.Builder builder = HttpRequest.newBuilder();
		return null; /** TODO not implemented */
	}
}


