package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import inputs.InputAccept;
import classes.Item;
import result.Output;

public class Start {

	public static void main(String[] args) throws IOException {
		BufferedReader o=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Item> list=new ArrayList<Item>();
		Item i;
		char ch;
		double total=0;
		do
		{
			i= InputAccept.accept();
			i.tax();
			total=i.getQuantity()*i.getFinal_price_after_tax();
			i.setTotal_Price(total);
			list.add(i);
			System.out.print("Do you want to enter another item details(Enter y/n) : ");
			ch=o.readLine().charAt(0);
		}while((ch=='y')||(ch=='Y'));
		
		Output.displayNames();
		for (Item item : list) {
			Output.displayResult(item);
		}
		

	}

}
