package com.olgun.dependency.injection.service.impl;

import com.olgun.dependency.injection.service.GoodMorningService;

public class GoodMorningServiceSpanishImpl implements GoodMorningService {

	@Override
	public String sayGoodMorning() {
		return "Good Morning in Spanish";
	}

}
