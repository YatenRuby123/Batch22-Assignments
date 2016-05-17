package jrout.tutorial.inheritance;

/**
 * Created by Jayram on 5/14/2016.
 */
public class SoftwareEngineer extends Employee {
	private String SoftwareEngineerTask;
	
	public SoftwareEngineer(String name, String SoftwarEngineerTask){
		super(name);
		this.SoftwareEngineerTask = SoftwareEngineerTask;
	}
	
	public String getSoftwareEngineerTask(){
		return SoftwareEngineerTask;
	}
	
	public void setSoftwareEngineerTask(String SoftwareEngineerTask){
		this.SoftwareEngineerTask = SoftwareEngineerTask;
	}
	
	@Override
	public void printDetails() {
			System.out.println("SotwareEngineer name = " + super.getName());
			System.out.println("Manager Task = " + this.SoftwareEngineerTask);
			
	}
	@Override
	public void schedule() {
		// TODO Auto-generated method stub
		
	}
	
    @Override
    public void behavior() {
    	System.out.println("Being a Software Engineer i shud code in few lines");
    }
}
