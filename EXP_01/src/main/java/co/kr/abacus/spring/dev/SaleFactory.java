package co.kr.abacus.spring.dev;

public class SaleFactory {
	
	public Object getBean(String saleType) {
		if ( saleType.equals("DEVICE")) {
			return new ModelDevice();
		} else if (saleType.equals("USIM")) {
			return new UsimDevice();
		} else if (saleType.equals("ASSCESSORIES")) {
			return new AccessoriesDevice();
		}
		
		return null;
	}

}
