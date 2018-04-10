package com.example.microservicesbasics.anime.logic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;;

@Component
public class AnimeLogicManager {
	@Value("${animeApiUrl:https://jsonplaceholder.typicode.com/users}")
	private String animeApiUrl;
	
	@Value("${animeApiKey:}")
	private String animeApiKey;
	
	@Value("${animeApiTags:}")
	private String animeApiTags;
	public ResponseEntity<String> obtainAnimeApiImageUrl() {
		String apiUrl = animeApiUrl + animeApiKey + animeApiTags;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiUrl, String.class);
		return response;
	}

}
