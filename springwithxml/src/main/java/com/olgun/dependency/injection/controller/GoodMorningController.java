package com.olgun.dependency.injection.controller;

import com.olgun.dependency.injection.service.GoodMorningService;


public class GoodMorningController {

	private GoodMorningService goodMorningService;
	
	public void setGoodMorningService(GoodMorningService helloWorldService){
		this.goodMorningService = helloWorldService;
	}
	public String sayGoodMorning() {
		return this.goodMorningService.sayGoodMorning();
	}
}
