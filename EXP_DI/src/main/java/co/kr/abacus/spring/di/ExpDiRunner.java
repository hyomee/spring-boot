package co.kr.abacus.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import co.kr.abacus.spring.di.entr.service.EntrService;

@Component
public class ExpDiRunner implements ApplicationRunner {

	@Autowired
	private EntrService entrServcie;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("*** Spring Autowired *************");
		entrServcie.entrServcie();

	}

}
