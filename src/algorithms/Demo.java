package algorithms;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {10, 25, 433, 26, 73, 132, 5};
		
		// create a sorted array 
		int[] sortedNumbers = {5, 9, 12, 18, 21, 26, 29, 35, 39, 45, 49, 51, 58, 59, 61, 72, 88, 91, 94};
		
		
		
		
//		int pos = algorithms.Search.linearSearch(numbers, 73);
//		
//		if(pos == -1){
//			
//			System.out.println("Sorry...Number not found");
//			
//		}else{
//			
//			System.out.println("Number found at position " + pos);
//			
//		}
//		
//		System.out.println("Thanks for the search...");
		

		int position = algorithms.Search.binarySearch(sortedNumbers, 26, 0, sortedNumbers.length-1);
		
		
		System.out.println(position);
		
		
	}

}
