package co.kr.abacus.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.kr.abacus.spring.dev.Device;
import co.kr.abacus.spring.dev.SaleFactory;

@SpringBootApplication
public class Exp01Application {

	public static void main(String[] args) {
		SpringApplication.run(Exp01Application.class, args);
		
		String saleType = "DEVICE";
		
		SaleFactory salefactory = new SaleFactory();
		
		if ( salefactory != null) {
			Device device = (Device) salefactory.getBean(saleType);
			device.sale();
			device.installment();
		}
		
		
	}
}
