package org.abc.constituency;

import org.abc.constituency.controller.ConstituencyController;
import org.abc.constituency.entity.Constituency;
import org.abc.constituency.exception.ConstituencyNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ConstituencyServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(ConstituencyServiceApplication.class, args);
//		ConstituencyController controller = container.getBean(ConstituencyController.class);
//		controller.registerNewConstituency(new Constituency(2,"Kudal"));
//		//controller.searchAll();
//		try {
//			controller.searchById(5);
//		} catch (ConstituencyNotFoundException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//		}
	}

}
