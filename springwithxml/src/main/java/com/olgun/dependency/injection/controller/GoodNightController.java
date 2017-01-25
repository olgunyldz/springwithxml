package com.olgun.dependency.injection.controller;

import com.olgun.dependency.injection.service.GoodNightService;


public class GoodNightController {

	private GoodNightService goodNightService;

	private GoodNightService goodNightServiceGermanImpl;

	private GoodNightService goodNightServiceTurkishImpl;

	public void setGoodNightServiceGermanImpl(GoodNightService goodNightServiceGermanImpl) {
		this.goodNightServiceGermanImpl = goodNightServiceGermanImpl;
	}

	public void setGoodNightService(GoodNightService goodNightService) {
		this.goodNightService = goodNightService;
	}

	public void setGoodNightServiceTurkishImpl(GoodNightService goodNightServiceTurkishImpl) {
		this.goodNightServiceTurkishImpl = goodNightServiceTurkishImpl;
	}

	
	public String sayGoodnight() {
		return this.goodNightService.sayGoodNight();
	}

	public String sayGoodnightInGerman() {
		return this.goodNightServiceGermanImpl.sayGoodNight();
	}

	public String sayGoodnightInTurkish() {
		return this.goodNightServiceTurkishImpl.sayGoodNight();
	}

	
}
