package jp.kurages.discord.services;

import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Singular;

@Getter
@Builder
@RequiredArgsConstructor
public class RequestParam {
	@Singular("param")
	private final Map<String, String> params;
}
