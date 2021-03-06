package co.kr.abacus.spring.javaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import co.kr.abacus.spring.javaconfig.entr.service.EntrService;

@SpringBootApplication
public class ExpJavaconfigApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExpJavaconfigApplication.class, args);
		
	    EntrService entrService = (EntrService) applicationContext.getBean("entrService");
		
		entrService.entrServcie();
	}

}
