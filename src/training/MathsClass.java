package training;

public class MathsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number = {2,4,6,8,12,15,17,21,24,27,30,32, 26, 39, 41, 55, 63, 67, 69, 70};
		
		System.out.println(binarySearch(number, 39, 0, number.length-1));
		
		
		
//		double num = Math.floor(3.9);
//		
//		System.out.println(num);
		
		
	}
	
	
	public static int binarySearch(int[] dataSet, int target, int start, int end){
		
		int midpoint = (int)Math.floor((start+end)/2);
		
		int midValue = dataSet[midpoint];
		
		if(midValue > target){
			
			System.out.println( midValue + " > " + target);
			
		}
		return midValue;
	}

	
}
