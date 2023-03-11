package jp.kurages.requests;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Requests {
	private final HttpClient client = HttpClient.newHttpClient();
	private final HttpRequest request;

	public Requests(Request request){
		HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(
			URI.create(request.getUrl())
		);
		for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
			requestBuilder.header(header.getKey(), header.getValue());
		}
		this.request = requestBuilder
			.method(request.getMethod().toString(), request.getBody())
			.build();
		log.debug(request.getUrl());
	}

	public String send() throws IOException, InterruptedException {
		return client.send(
			this.request,
			HttpResponse.BodyHandlers.ofString()
		).body();
	}
}
