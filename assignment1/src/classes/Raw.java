package classes;
/*
 * Raw: 12.5% of the item cost

 */

public class Raw extends Item{
	
	public Raw(String name, double price,int quantity, String type)
	{
		super(name,price,quantity,type);
	}
	
	public void tax() 
	{
		tax_liability = Constant.RAW_TAX * price ; 
		final_price_after_tax = price + tax_liability ;
	}

}
