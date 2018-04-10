package com.example.microservicesbasics.anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicesbasics.anime.logic.AnimeLogicManager;
import com.example.microservicesbasics.kittens.web.KittensWebResult;

@RestController
public class AnimeWeb {
	@Autowired
	AnimeLogicManager manager;
	@RequestMapping("/anime")
	@ResponseBody
	ResponseEntity<String> anime() {
		ResponseEntity<String> result = manager.obtainAnimeApiImageUrl();
		//AnimeWebResults awRes = new AnimeWebResults();
		//awRes.setUrl(result);
		return result;
	}
}
