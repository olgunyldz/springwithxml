package com.olgun.dependency.injection.service.impl;

import com.olgun.dependency.injection.service.GoodMorningService;

public class GoodMorningServiceTurkishImpl implements GoodMorningService {

	@Override
	public String sayGoodMorning() {
		return "Good Morning in Turkish!!!";
	}

}
