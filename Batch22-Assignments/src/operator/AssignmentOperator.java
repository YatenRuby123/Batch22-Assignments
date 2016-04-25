package operator;

public class AssignmentOperator {
	public static void main(String[] args){
		
	int age = 5;
	int ageTwo = 11;
	int ageThree = 12;
	double ageFour = 13d;
	double ageFive = 15d;
	
	System.out.println(age);
	System.out.println(ageTwo);
	System.out.println(ageThree);
	System.out.println(ageFour);
	System.out.println(ageFive);
	
//	age = age + 5;
	age += 5;
	ageTwo -= 1;
	ageThree *= 5;
	ageFour /= 14;
	ageFive %= 70;
	
	
	System.out.println(age);
	System.out.println(ageTwo);
	System.out.println(ageThree);
	System.out.println(ageFour);
	System.out.println(ageFive);

}
}
