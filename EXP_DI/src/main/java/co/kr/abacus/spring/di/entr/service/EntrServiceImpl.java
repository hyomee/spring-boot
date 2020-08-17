package co.kr.abacus.spring.di.entr.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import co.kr.abacus.spring.di.entrdev.service.Device;
import co.kr.abacus.spring.di.entrsvc.service.EntrBySvcService;

@Component
public class EntrServiceImpl implements EntrService {
	
	@Autowired
	private EntrBySvcService entrBySvcServcie;
	
	@Autowired
	@Qualifier("modelDevice")
	private Device modelDevice;
	
	
	@Resource(name = "usimDevice")
	private Device usimDevice;
	

	@Override
	public void entrServcie() {
		System.out.println("가입 서비스");
		entrBySvcServcie.entrBySvc();
		System.out.println("*** Spring Autowired, Qualifier  *************");
		modelDevice.sale();
		System.out.println("*** javax.annotation.Resource  *************");
		usimDevice.sale();
	}

}
