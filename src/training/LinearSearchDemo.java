package training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ask user for seven numbers
		System.out.println("Please enter seven integers: ");
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] numbers = new int[7];
		
		
		
		for(int i=0; i< 7; i++){
			
			try{
				
				numbers[i] = sc.nextInt();
				
			}catch(InputMismatchException e){
				
				System.out.println(e.toString());
				break;
			}
			
		
			
		}
		
		
		// call function to print 
		printElements(numbers); 
		
		
		System.out.print("Enter number to search: " );

		int result = 0;
		
		try{
			
			result = sc.nextInt();
			
		}catch(InputMismatchException e){
			
			System.out.println(e.toString());
		}
		
		// call to search 
		int searchResult = linearSearch(numbers, result);
		
		searchItemResult(searchResult);
		
		
		sc.close();
	}
	
	
	// print the array elements using the enhance for loop
	public static void printElements(int[] numbers){
		
		System.out.println("Printing of numbers"); 
		for(int number : numbers){
			
			System.out.println(number + " ");
			
		}
		
		
	}
	
	
	// use linear search to search for a number in the list
	public static int linearSearch(int[] dataSet, int target){
		
		for(int i=0; i< dataSet.length; i++){
			
			if(target == dataSet[i])
				return i;
		}
		
		return -1;
		
	}
	
	public static int searchItemResult(int result){
		

		if(result != -1){
			int position = result +1;
			System.out.println("Number found at position " + position);
			return  position;
			
		}else{
			
			System.out.println("Number not found in the list ");
			return -1;

		}
		
	}
	
	
}
