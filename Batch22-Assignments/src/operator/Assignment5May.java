package operator;

public class Assignment5May {
		
	public static void main(String[] args){
		
		reverseNumber(98765);	
	}
	
	
	public static int reverseNumber(int num){
		int result = 0;
		System.out.println(num%10);
		
		if (num >= 10) {
		result = ((int)reverseNumber(num/10));
	
		}
		return result; 
	}
		
}
