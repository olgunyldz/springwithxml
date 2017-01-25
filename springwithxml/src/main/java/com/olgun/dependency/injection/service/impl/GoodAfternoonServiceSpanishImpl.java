package com.olgun.dependency.injection.service.impl;

import com.olgun.dependency.injection.service.GoodAfternoonService;


public class GoodAfternoonServiceSpanishImpl implements GoodAfternoonService {

	@Override
	public String sayGoodAfternoon() {
		return "Good Afternoon in Spanish";
	}

}
