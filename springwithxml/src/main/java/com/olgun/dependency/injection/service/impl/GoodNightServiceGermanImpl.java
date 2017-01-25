package com.olgun.dependency.injection.service.impl;

import com.olgun.dependency.injection.service.GoodNightService;


public class GoodNightServiceGermanImpl implements GoodNightService {

	@Override
	public String sayGoodNight() {
		return "Good Night in German";
	}

}
