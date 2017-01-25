package com.olgun.dependency.injection.util;

import com.olgun.dependency.injection.service.GoodNightService;
import com.olgun.dependency.injection.service.impl.GoodNightServiceEnglishImpl;
import com.olgun.dependency.injection.service.impl.GoodNightServiceGermanImpl;
import com.olgun.dependency.injection.service.impl.GoodNightServiceSpanishImpl;
import com.olgun.dependency.injection.service.impl.GoodNightServiceTurkishImpl;

public class AppFactory {

	public GoodNightService createGoodNightService(String lang){
		GoodNightService goodNightService = null;
		switch (lang) {
		case "en":
			goodNightService = new GoodNightServiceEnglishImpl(); 
			break;
		case "de":
			goodNightService = new GoodNightServiceGermanImpl(); 
			break;
		case "tr":
			goodNightService = new GoodNightServiceTurkishImpl(); 
			break;
		case "es":
			goodNightService = new GoodNightServiceSpanishImpl(); 
			break;
		default:
			goodNightService = new GoodNightServiceEnglishImpl();
			break;
		}
		return goodNightService;
	}
}
