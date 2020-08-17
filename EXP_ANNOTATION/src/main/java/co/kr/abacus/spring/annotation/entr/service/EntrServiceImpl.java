package co.kr.abacus.spring.annotation.entr.service;

import org.springframework.stereotype.Component;

import co.kr.abacus.spring.annotation.entrsvc.service.EntrBySvcService;

@Component("EntrService")
public class EntrServiceImpl implements EntrService {
	
	@SuppressWarnings("unused")
	private EntrBySvcService entrBySvcServcie;
	
	public EntrServiceImpl(EntrBySvcService entrBySvcServcie) {
		this.entrBySvcServcie = entrBySvcServcie;
	}
	

	@Override
	public void entrServcie() {
		System.out.println("가입 서비스");
		entrBySvcServcie.entrBySvc();
	}

}
