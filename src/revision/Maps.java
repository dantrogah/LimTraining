package revision;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		// create a map - key value pair
		
		Map<Integer, String> studentRecord = new HashMap<Integer, String>();
		
		
		// assign items and their keys[id] to the map
		
		studentRecord.put(10, "Daniel");
		
		studentRecord.put(40, "Nelson");
		
		studentRecord.put(25, "Angela");
		
		studentRecord.put(18, "Emmanuel");
		
		studentRecord.put(11, "Mercy");
		
		
		// print all elements in the map
		
		System.out.println(studentRecord);
		
		System.out.println(studentRecord.keySet());
		
		
		// print elements and their keys using the enhanced for loop
		
		for(int key : studentRecord.keySet()){
			
			System.out.println("Key: " + key + " Value: " + studentRecord.get(key));
			
		}
	}

}
