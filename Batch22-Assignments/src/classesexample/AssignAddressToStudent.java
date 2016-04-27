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
		
		
		
		studMeenak.address.state = "NorthCarolina";
		studMeenak.address.country = "USA";
		
		// CODE ENDS HERE
		System.out.println(studMeenak.address.state);// INDIA , USA
		System.out.println(studMeenak.address.country);
		
	}
}