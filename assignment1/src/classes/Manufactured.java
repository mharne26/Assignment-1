package classes;

public class Manufactured extends Item {
	
	public Manufactured(String name, double price,int quantity, String type)
	{
		super(name,price,quantity,type);
	}
	
	public void tax() {
		tax_liability = Constant.MANUFACTURED_TAX* price + (1+Constant.MANUFACTURED_TAX) * price * Constant.SURCHRGE_RATE_MANUFACTURED; 
		final_price_after_tax = price + tax_liability ;
	}

}
