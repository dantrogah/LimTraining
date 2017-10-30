package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
	
		Set<String> shopping = new TreeSet<>();
		
		shopping.add("Amanda");
		shopping.add("Sherry");
		
		
		shopping.add("Emma");
		shopping.add("Jane");
		
		for(String shoppings : shopping){
			System.out.println(shoppings);
		}
		
		System.out.println("Number of items is " + shopping.size());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item to remove");
		String item = sc.nextLine();
		
		shopping.remove(item);
		
		System.out.println("Number of items is " + shopping.size());
		
		for(String shoppings : shopping){
			System.out.println(shoppings);
		}
		
		
		sc.close();
	
	}
	
	

}
