package training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] numbers = new int[7];
		
		int[] sortedNumbers = {1,2,4,6,7,8,9,11,13, 15, 18, 45, 67};
		

//		System.out.println("Please enter seven integers: ");
//		
		Scanner sc = new Scanner(System.in);
//		
//		
//		for(int i=0; i< 7; i++){
//			
//			try{
//				
//				numbers[i] = sc.nextInt();
//				
//			}catch(InputMismatchException e){
//				
//				System.out.println(e.toString());
//				
//			}
//				
//		}
		
			// sort array
		//bubbleSort(numbers);
		
		//find an item
		System.out.println("Enter the number to search: ");
		int searchItem = sc.nextInt();
		
		binarySearch(sortedNumbers , searchItem, 0, sortedNumbers.length-1 );
		
		
		sc.close();
	}
	
	
	public static void bubbleSort(int[] dataSet){
		
		boolean status = false;
		int temp = 0;
		
		do {
			
			for(int i=0; i<dataSet.length-1; i++){
				
				if(dataSet[i] > dataSet[i+1]){
					
					temp = dataSet[i];
					dataSet[i] = dataSet[i+1];
					dataSet[i+1] = temp;
					
					// sorted values 
					for(int data : dataSet){
						System.out.print(data + " ");
					}	// sorted values 
					
					System.out.println();
					status = true;
					
				}
				
			}
			
		}while(status);
		
	
	}
	
	public static void binarySearch(int[] dataSet, int target, int start, int end){
		
		int midpoint = (int)Math.floor((start+end)/2);
		
		int midValue = dataSet[midpoint];
		
		if(midValue > target){
			
			System.out.println(midValue + " > " + target);
			binarySearch(dataSet, target, 0, midpoint);
			
		}else if(midValue < target){
			
			System.out.println(midValue + " < " + target);
			binarySearch(dataSet, target, midValue, dataSet.length-1);
		}else{
			
			System.out.println(midValue + " = " + target);
		}
		
	}
	


}
