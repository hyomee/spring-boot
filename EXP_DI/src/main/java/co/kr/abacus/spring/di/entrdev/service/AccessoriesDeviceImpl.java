package co.kr.abacus.spring.di.entrdev.service;

import org.springframework.stereotype.Component;

@Component("accessoriesDevice")
public class AccessoriesDeviceImpl implements Device{
	
	// 일반 판매 
	public void sale() {
		System.out.println("Accessories 일반  판매");
	}
	
	// 할브 판매 
	public void installment() {
		System.out.println("Accessories 할부  판매");
	}

}
