package inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classes.*;

public class InputAccept {
	static BufferedReader o1=new BufferedReader(new InputStreamReader(System.in));
	public static Item accept() throws IOException{
	
	String name;
	int quantity;
	double price;
	String str;
	String type;
	boolean ok;
	
	System.out.println("Enter Name:");
	name=o1.readLine();
	
	System.out.println("Enter Price:");
	do {
		str=o1.readLine();
		ok=InputValid.checkDouble(str);
	}while(!ok);
	price=Double.parseDouble(str);
	
	System.out.println("Enter Quantity:");
	do {
		str=o1.readLine();
		ok=InputValid.checkInt(str);
	}while(!ok);
	quantity=Integer.parseInt(str);
	
	System.out.println("Enter Type:");
	do {
		str=o1.readLine();
		ok=InputValid.checkType(str);
	}while(!ok);
	type=str.toLowerCase();
	
	Item i;
	switch(type) {
		case Constant.RAW:
			i=new Raw(name,price,quantity,type);
			break;
		case Constant.MANUFACTURED:
			i=new Raw(name,price,quantity,type);
			break;
		default:
			i=new Imported(name,price,quantity,type);
			break;
	}
	
	return i;
	
	}

}
