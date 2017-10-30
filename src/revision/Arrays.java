package revision;

public class Arrays {

	public static void main(String[] args) {
		
		// 1. create an array
		String[] names = {"Dan", "Rob", "Bob", "Nel", "Cynthia"};
		
		// 2. print array elements
		for(String name : names){
			System.out.println(name);
		}
		
		// 3. size of array
		System.out.println("Array size is " + names.length);
		
		// 4. clone array
		System.out.println(names.clone().toString());
		
		// 5. size of array
		System.out.println("Array size is " + names.length);
		
		
		// 6. Multidimensional array
		String[][] personalRecords = {	
				
				{"Bob", "24", "bob@ymail.com"},
				
				{"Tom", "35", "tom@ymail.com"},
				
				{"Nel", "54", "nel@ymail.com"},
				
				{"Pearl", "19", "pearl@ymail.com"},
		};
		
		// 7. Traverse multidimensional array.
		for(String[] record : personalRecords){
			
			for(String personalRecord : record ){
				
				System.out.print(personalRecord + " ") ;
				
			}
			
			System.out.println();
		}
		
		

	}

}
