package jrout.tutorial.constructor;

public class Piano {
	String name;
	String color;
	String brand ;
	int size;
	
	public Piano(String brand){
		System.out.println(brand + " Got Created");
		this.brand = brand;
	}
	
	public Piano(String brandValue,String colorValue){
		this.brand = brandValue;
		color = colorValue;
	}
	
	public Piano(String brandValue,String colorValue, String nameVal){
		
		this(brandValue,colorValue);
		name = nameVal;   /*Exception in thread "main" java.lang.Error: Unresonulllved compilation problem: 
		Constructor call must be the first statement in a constructor*/
	}
	
	public Piano(String brandValue,String colorValue, String nameVal , int sizeVal){
		this(brandValue,colorValue,nameVal);
		size = sizeVal;
	}

	public void printDetails() {
		System.out.println("Piano Details =" + "\n" +  brand + "\n " + color + "\n " + name + "\n " + size);
		//printDetails("Test");
	}
	
	public void printDetails(String name){
		printDetails();
		System.out.println("Details for "+ name);
	
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("I am being destroyed" + brand);
	}
	
}