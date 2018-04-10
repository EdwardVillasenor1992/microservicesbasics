package com.example.microservicesbasics.kittens.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KittensWeb {
	@Value("${kittensApiUrl:default.kittens.url}")
	private String kittensApiUrl;
	@Value("${kittensApiKey: 123456}")
	private String kittensApiKey;
	@RequestMapping("/kittens")
	@ResponseBody
	KittensWebResult kittens() {
		KittensWebResult kwRes = new KittensWebResult();
		kwRes.setId("1");
		kwRes.setName("kitty");
		kwRes.setApiUrl(kittensApiUrl);
		return kwRes;
	}

}
