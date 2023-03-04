package jp.kurages.requests;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Requests {
	private HttpClient client = HttpClient.newHttpClient();
	private HttpRequest request;

	public Requests(Request request){
		HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(
			URI.create(request.getUrl())
		);
		for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
			requestBuilder.header(header.getKey(), header.getValue());
		}
		this.request = requestBuilder
			.method(request.getMethod().getMethod(), request.getBodyPublisher())
			.build();
	}

	public String send() {
		try {
			return client.send(
				this.request,
				HttpResponse.BodyHandlers.ofString()
			).body();
		} catch (Exception e) {
			return null;
		}
	}
}
