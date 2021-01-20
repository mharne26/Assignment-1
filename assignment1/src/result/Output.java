package result;

import classes.Item;

public class Output {
	public static void displayNames() {
		System.out.println("\nOutput:\n");
		String str = String.format("%-10s%-15s%-15s%-25s%-25s%-7s%-25s", "Name","Price","type","tax liability","Final Price per Item","Qty","Total Price");
		System.out.println(str);
		
	}
	public static void displayResult(Item i)
	{
		String str = String.format("%-10s%-15.3f%-15s%-25.4f%-25.4f%-7d%-25.4f", i.getName(),i.getPrice(),i.getType(),i.getTax_liability(),i.getFinal_price_after_tax(),i.getQuantity(),i.getTotal_Price());
		System.out.println(str);
		
	
	
	}
}
