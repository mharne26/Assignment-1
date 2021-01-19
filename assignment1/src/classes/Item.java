package classes;

public abstract class Item {
	
	protected String name ;
	protected double price ;
	protected int quantity ;
	protected String type ;
	protected double tax_liability ;
	protected double final_price_after_tax ;
	protected double total_Price ;
	
	public Item(String name, double price,int quantity, String type) {
		this.name = name ;
		this.price=price;
		this.quantity=quantity;
		this.type=type;
	}
	
	public abstract void tax();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTax_liability() {
		return tax_liability;
	}

	public void setTax_liability(double tax_liability) {
		this.tax_liability = tax_liability;
	}

	public double getFinal_price_after_tax() {
		return final_price_after_tax;
	}

	public void setFinal_price_after_tax(double final_price_after_tax) {
		this.final_price_after_tax = final_price_after_tax;
	}

	public double getTotal_Price() {
		return total_Price;
	}

	public void setTotal_Price(double total_Price) {
		this.total_Price = total_Price;
	}
	
	

}
