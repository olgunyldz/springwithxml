package com.olgun.dependency.injection.service.impl;

import com.olgun.dependency.injection.service.GoodNightService;


public class GoodNightServiceTurkishImpl implements GoodNightService {

	@Override
	public String sayGoodNight() {
		return "Good Night in Turkish";
	}

}
