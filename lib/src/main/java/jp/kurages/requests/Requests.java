package jp.kurages.requests;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class Requests {
	private final HttpClient client = HttpClient.newHttpClient();
	private final HttpRequest request;

	public Requests(Request request){
		HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
			.uri(URI.create(request.getUrl()))
			.method(request.getMethod().toString(), request.getBody());
		for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
			log.debug("setHeader {} {}", header.getKey(), header.getValue());
			requestBuilder.header(header.getKey(), header.getValue());
		}
		this.request = requestBuilder.build();
		log.debug(request.getUrl());
	}

	public String send() throws IOException, InterruptedException {
		return client.send(
			this.request,
			HttpResponse.BodyHandlers.ofString()
		).body();
	}
}
