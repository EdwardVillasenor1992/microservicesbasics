package com.example.microservicesbasics.anime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicesbasics.kittens.web.KittensWebResult;

@RestController
public class AnimeWeb {
	@RequestMapping("/anime")
	@ResponseBody
	AnimeWebResults anime() {
		AnimeWebResults awRes = new AnimeWebResults();
		awRes.setId("2");
		awRes.setName("anime");
		awRes.setUrl("stub.url");
		return awRes;
	}
}
