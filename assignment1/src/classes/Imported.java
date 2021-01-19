package classes;

public class Imported extends Item{
	
	public Imported(String name, double price,int quantity, String type)
	{
		super(name,price,quantity,type);
	}
	public void tax() {
		tax_liability=Constant.IMPORTED_TAX*price;
		final_price_after_tax = price+tax_liability;
		
		if(final_price_after_tax<=100)
		{
			tax_liability+=5;
			final_price_after_tax+=5;
		}
		else if(final_price_after_tax<=200)
		{
			tax_liability+=10;
			final_price_after_tax+=10;
		}
		else {
			final_price_after_tax = 1.05 * final_price_after_tax ;
			tax_liability = final_price_after_tax - price ;
		}
	}
}
