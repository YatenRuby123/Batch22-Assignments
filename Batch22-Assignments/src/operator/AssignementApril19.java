package operator;

import operator.calculator;


public class AssignementApril19 {
	
	public static void main(String[] args){
		int details[][] = {{30,5},{20, 4},{34,8}};
		
		for(int[] val :  details){
			System.out.println(val[0] + " == " + val[1]);
				
		}
		ifStatement1();
		switchStatement();		
		System.out.println(calculator.calcuate(3,5));
		System.out.println(calculator.substract(10, 5));
		switchStatement1();
		
	}
			
	public static void ifStatement1(){

		int ages[] = { 20, 30, 40 };
	for(int age : ages){
	if(age == 20) 
		System.out.println("I am still Young");
		System.out.println("I play football");
	if(age == 30)
		System.out.println("Wow I have reached 30 !!!");
	}
	

  }
	
	public static void switchStatement() {

		int ages[] = { 20, 30, 40 };

		for (int age : ages) {
			
			switch (age) {
			case 20: {
				System.out.println("I am still Young");
				break;
			}
			case 30: {
				System.out.println("Wow I have reached 30 !!!");
				break;
			}
			case 40: {
				System.out.println("Oops I have reached 40 ");
				break;
			}
			default:
				System.out.println("You are not yet born.....");
			}
		}
	}


public static void switchStatement1() {

	int ages[] = { 20, 30, 40 };
    String ageString;
	for (int age : ages) {
		
		switch (age) {
		case 20: ageString = "I am still Young";
			break;
		
		case 30: ageString = "Wow I have reached 30 !!!";
			break;
		
		case 40: ageString ="Oops I have reached 40 ";
			break;
		
		default: ageString ="You are not yet born.....";
	}
		System.out.println(ageString);
	
	}
  }
}
