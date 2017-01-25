package com.olgun.spring.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.olgun.dependency.injection.controller.GoodAfternoonController;
import com.olgun.dependency.injection.controller.GoodMorningController;
import com.olgun.dependency.injection.controller.GoodNightController;

@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	try {
    		ApplicationContext context =  (ApplicationContext) SpringApplication.run(App.class, args);

        	GoodMorningController goodMorningController= (GoodMorningController)context.getBean("goodMorningController");
        	
        	System.out.println(goodMorningController.sayGoodMorning());
        	
        	GoodAfternoonController  goodAfternoonController = (GoodAfternoonController) context.getBean("goodAfternoonController");
        	System.out.println(goodAfternoonController.sayGoodAfternoon());
        	
        	GoodNightController goodNightController = (GoodNightController) context.getBean("goodNightController");
        	System.out.println(goodNightController.sayGoodnight());
        	System.out.println(goodNightController.sayGoodnightInGerman());
        	System.out.println(goodNightController.sayGoodnightInTurkish());
        	
		} 
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	System.exit(0);
    }
}
