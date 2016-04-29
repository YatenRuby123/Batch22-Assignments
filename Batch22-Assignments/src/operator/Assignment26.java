package operator;


import classesexample.Student;

public class Assignment26 {
	public static void main(String[] args){
		
		Student myStudent = new Student();
		myStudent.rollNumber = "";
		
	
		
		String[] address ={"Los Angeles", "San Diego", "RiverSide"};
		
		myStudent.address =  address;
		
	System.out.println(myStudent.rollNumber);
	
	System.out.println(myStudent.address[1]);
	}
}
