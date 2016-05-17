package jrout.tutorial.inheritance;

public class InheritanceClient {

	public static void main(String[] args) {
		/*Person per = new Person("Tanu");
		per.printDetails();*/
		
		/*Clerk clerk = new Clerk("Raju","Response for Printing");
		clerk.printDetails();*/
		
		Person person = new Manager("Vijay","Managing the Project");
		person.printDetails();

//		SportsPerson sportsPerson = new SportsPerson("Jayram");



//		Employee emp = new Manager("Vijay","Managing the Project");
//		emp.schedule();
		
		Person per = new Manager("Vijay","Managing the Project");
        per.schedule();//need to create method in Super class(Person).

	}
}
