package revision;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {

	public static void main(String[] args) {
		
		// 1. create a list of shopping items
		List<String> shoppingList = new ArrayList<>();
		
		// 2. Ask for user input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 items");
		
	
		// 3. add to the list 
		shoppingList.add(sc.nextLine());
		shoppingList.add(sc.nextLine());
		shoppingList.add(sc.nextLine());
		shoppingList.add(sc.nextLine());
		
		// 4. print the list 
		for(String list : shoppingList){
			
			System.out.println(list);
		}
		
		
		// 5. Remove an item
		System.out.print("Enter the item to remove: ");
		
		String itemRemove = sc.nextLine();
		
		shoppingList.remove(itemRemove);
		
		// 6. Number of item on the list
		System.out.println(shoppingList.size());
		
		
		// 7. print the list 
		for(String list : shoppingList){
					
				System.out.println(list);
		}
		
		System.out.println("The last item on the list is " + shoppingList.get(shoppingList.size()-1));
		
		// 8. Add to the list again
		System.out.print("Add an item again: ");
		shoppingList.add(sc.nextLine());
		
		// 7. print the list 
		for(String list : shoppingList){
							
				System.out.println(list);
				
		}
		
		// 8. Access the last element
		System.out.println("The last item on the list is " + shoppingList.get(shoppingList.size()-1));
					
	
		sc.close();
	}

}
