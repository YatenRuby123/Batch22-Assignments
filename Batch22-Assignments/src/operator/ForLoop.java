package operator;

public class ForLoop {
	
	public static void main(String[] args){
		int ages[] = {20,30,40};
		
		for(int age : ages){
//			System.out.println(age);
			if(age == 30) {
				System.out.println("Wow I have reached 30!!!");
				System.out.println("Hello");
			} if(age == 20){
				System.out.println("myworld");
			}
		}
	}

}
