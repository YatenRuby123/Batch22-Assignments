package operator;

import java.util.Arrays;

public class Assignment21April {
	
	
	public static void main(String[] args){
		oddNumber();
		eveNumber();
		good();
		tempEven();
		tempOdd();
		evenOrOdd();
		reverseWhile();
		reverseFor();
		prntIndex();
	}
	
public static void oddNumber(){
		int [] number = new int []{1,2,3,4,5,6,7,8,9,10};
		
		for(int i =1; i< number.length; i++){
			if(i%2 == 0 ){
				continue;
			}
			System.out.println("Value for continue oddNumber ex: " + i);
		}
	}
public static void eveNumber(){
	int [] number = new int []{1,2,3,4,5,6,7,8,9,10};
	
	for(int i =1; i< number.length; i++){
		if(i%2 != 0 ){
			continue;
		}
		System.out.println("Value for continue eveNumber ex: " + i);
	}
}

		
	
	
		
	public static void tempEven(){
		int limit = 100;
		//int a [] = new int [limit];
		System.out.println("Print number between 1 and " + limit);
		
		for(int i = 0; i < limit; i++){
		
		if (i % 2 == 0){
			System.out.println(i + " is Even Number");
		}
	}
	}		
		
		
		
	public static void tempOdd(){
		int limit = 100;
	//int a [] = new int [limit];
System.out.println("Print number between 1 and " + limit);
		
		for(int j = 0; j < limit; j++){
		
		if (j % 2 != 0){
			System.out.println(j + " is odd number");
		}
	}
}
	
	public static void evenOrOdd(){
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,
				24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,
				51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,
				78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};		
			
			for (int i=0; i< numbers.length; i++){
				
				if(numbers[i]%2 == 0){					
					System.out.println(numbers[i]+ " is even number");					
				}else{
					System.out.println(numbers[i]+ " is odd number");
				}	
				
			}
		}
	
	public static void good(){
	
	String fruits[] = {"apple","banana","kiwi"};
	String sports[] = {"football","baseball","cricket"};
	String laptops[] = {"mac","lenovo","ibm"};

	String goods[][] = {fruits,sports,laptops}; // new String[3][3];

	 for(int i = 0 ; i < goods.length; i++){
		String eachGood[] = goods[i];
		for(int j = 0 ; j < eachGood.length; j++){
			//sop(eachGood[j]);
			String value = goods[i][j];
			// value == cricket
			if(value.equals("cricket"))
					break;
			//break outerLoop; // when you use this please use outerLoop : //in the first for loop
			
			System.out.print(value);
		}
		System.out.print("Lenght is "+ eachGood.length);
		
	}
	
	}
	
	public static void reverseWhile(){
		int input = 123456789;
		int reversedNum = 0;
		while(input != 0){
		int	last_digit = input % 10;
			if(last_digit != 0){
				reversedNum = reversedNum * 10 + last_digit;
			}
			input = input/10;
		}
		System.out.println("Reverse number for while loop is: "+ reversedNum);
	}
	
	public static void reverseFor(){
		int input = 123456789;
		int reverseNum = 0;
	
		for(;input != 0;){
			int last_digit = input % 10;
			if(last_digit != 0){
			reverseNum = reverseNum * 10 + last_digit;
		
		}
			input = input/10;
	}
		System.out.println("Reverse number for For Loop is: " + reverseNum);
}
	
	public static void prntIndex(){
		Integer[] value = {23,45,6,7,88,90};
		
		int indexOf88 = Arrays.asList(value).indexOf(88);
		
		System.out.println(indexOf88);
	}
}
		
	

