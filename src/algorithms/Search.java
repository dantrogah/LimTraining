package algorithms;

public class Search {
	
	public static int linearSearch(int[] dataSet, int target){
		
		for(int i=0; i< dataSet.length; i++){
			
			if(dataSet[i] == target){
				
				return i;
				
			}
		}
		
		return -1;
	}
	
	
	// function to perform binary search 
	
	public static int binarySearch(int[] dataSet, int target, int start, int end){
		
		int middle = (int) Math.floor((start+end)/2);
		
		int value = dataSet[middle];
		
		
		if(target > value){
			
			System.out.println(target + " > " + value);
			return binarySearch(dataSet, target, middle+1, dataSet.length-1);
			
		}else if(target < value){
			
			System.out.println(target + " < " + value);
			return binarySearch(dataSet, target, start, middle -1);
		}
		
		System.out.println(target + " = " + value);
		
		return middle;
	}

}

