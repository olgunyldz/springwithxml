package com.olgun.dependency.injection.controller;

import com.olgun.dependency.injection.service.GoodAfternoonService;

public class GoodAfternoonController {

	private GoodAfternoonService goodAfternoonService;


	public  void setGoodAfternoonService(GoodAfternoonService appService) {
		this.goodAfternoonService = appService;
	}

	public String sayGoodAfternoon() {
		return this.goodAfternoonService.sayGoodAfternoon();
	}

}
