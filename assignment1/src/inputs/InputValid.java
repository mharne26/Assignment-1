package inputs;
import classes.Constant;

public class InputValid {
	
	public static boolean checkDouble(String str) {
		try {
			Double.parseDouble(str);
		}
		catch(Exception e)
		{
			System.out.println("Enter value in double format");
			return false;
		}
		return true;
	}
	
	public static boolean checkInt(String str) {
		try {
			Integer.parseInt(str);
		}
		catch(Exception e)
		{
			System.out.println("Enter value in Integer format");
			return false;
		}
		return true;
	}
	
	public static boolean checkType(String str) {
		if(str.equalsIgnoreCase(Constant.RAW)|str.equalsIgnoreCase(Constant.MANUFACTURED)|str.equalsIgnoreCase(Constant.IMPORTED))
			return true;
		System.out.println("Enter correct item type i.e (Raw, Manufactured, Imported)");
		return false;
	}

}
