package com.example.microservicesbasics.kittens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicesbasics.kittens.logic.KittensLogicManager;

@RestController
public class KittensWeb {
	@Autowired
	KittensLogicManager manager;
	@RequestMapping("/kittens")
	@ResponseBody
	ResponseEntity<String> kittens() {
		ResponseEntity<String> result = manager.obtainKittenApiImageUrl();
		
		return result;
	}
	
	

}
