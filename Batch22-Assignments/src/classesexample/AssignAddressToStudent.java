package classesexample;
import classesexample.*;



public class AssignAddressToStudent {

	public static void main(String[] args) {

		Student studMeenak = new Student();
		studMeenak.studName = "Meena";
		studMeenak.studId = 24;
		studMeenak.studGrade = "Sixth";
		
		// CODE STARTS HERE
		// Please check on this if this works !!!...
		Address address1= new Address();
		address1.state = "NorthCarolina";
		address1.country = "USA";
		
		studMeenak.address1 = address1;

		
		// CODE ENDS HERE
		System.out.println(studMeenak.address1.state);// INDIA , USA
		System.out.println(studMeenak.address1.country);
		
	}
}