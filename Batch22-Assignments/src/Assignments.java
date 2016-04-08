
public class Assignments {


/**
 * 
 * @author Jayram
 * @since April 7th
 *  Hello This is my first program
 *  which is used to 
 * explain students the concept.
 *
 */

	// Single line comment
	// public static void main : is a method
	// private 
	
	/**
	 * This is my main Method which just prints Hello Guys...
	 */
	
	/*
	 * This is just for test
	 */
	static public void main(String[] arg) {
		int age = 10;
		
		//assignment
		String str = new String("  Welcome to H2K  ");
		
		String strN = new String ("Old is gold");
		
		System.out.println("HelloWorld.main() : Hello Guys..Welcome!!!" + arg[0] +"----"+ arg[1]);
		System.out.println(System.currentTimeMillis());
		
		//assignment
		System.out.print("Trim value is:");
		System.out.println(str.trim());
		
		justPrintMe();
		
		System.out.println(); // sysout ctrl+ space
		System.out.println("HelloWorld.main()"); //systrace
		
		
		//Assignment 1 - Yatendra
		System.out.println("Yatendra".concat(" Pawar"));//joins
		System.out.println("Yatendra".length()); //finds exact length of string
		System.out.println("Yatendra".contains("a")); //boolean - true or false if the string contains letter
		System.out.println("Yatendra".charAt(5)); //gives value of the 5th index in the string
		System.out.println("Yatendra".substring(2, 5));// 5-2 = 3 (value = 2index and the difference)
		System.out.println("Yatendra".isEmpty()); //Boolean - t or f if the string is empty or not
		System.out.println("".isEmpty()); //same as above
		System.out.println("YaTendra".toUpperCase());//converts String to upper case
		System.out.println("YATENDRA".toLowerCase());//Converts string to lower case
		System.out.println("Yatendra".replace("ten", "sum"));//Replace old with new
	
		
		
		
	}
	
	public static void justPrintMe(){
		System.out.println("Just print me " + returnYourName());
		System.out.println("HelloWorld.justPrintMe()");
	}
	
	public void imPort(){
		System.out.println("HelloWorld.imPort()");
		System.out.println();

	}
	
	public static String returnYourName(){
		return "Jaryam";

		
	}
}