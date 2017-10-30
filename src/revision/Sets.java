package revision;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		// Create a set
		
		Set<String> firstNames = new HashSet<>();
		
		// add to the set
		
		firstNames.add("Daniel");
		
		firstNames.add("Seraphine");
		
		firstNames.add("Delali");
		
		firstNames.add("Vivian");
		
		firstNames.add("Dzifa");
		
		// print the items in the Set

		for(String firstName : firstNames){
			
			System.out.println(firstName);
		}
		
		// print number of items in the set
		
		System.out.println("There are five elements " + firstNames.size());
		
		// add more items to the Set
		
		firstNames.add("Daniel");
		
		firstNames.add("Seraphine");
		
		firstNames.add("Delali");
		
		
		// print the items in the Set

		for(String firstName : firstNames){
			
			System.out.println(firstName);
		}
		
		// print number of items in the set
		
		System.out.println("There are five elements " + firstNames.size());
		
		
		Set<String> lastNames = new HashSet<>();
		
		lastNames.add("Delali");
		lastNames.add("Thompson");
		lastNames.add("Vivian");
		lastNames.add("Ezekiel");
		
		// print the items in the Set

		for(String firstName : lastNames){
					
			System.out.println(firstName);
		
		}
		
		// print items common to both sets
		
		Set<String> intersectionSet = new HashSet<>(firstNames);
		
		intersectionSet.retainAll(lastNames);
		
		System.out.println("Items common to both set: " + intersectionSet);
		
		
		// print all the elements in the two sets.
		
		Set<String> unionSet = new HashSet<>(firstNames);
		
		unionSet.addAll(lastNames);
		
		System.out.println("Union Set: " + unionSet);
		
		// print elements in the firstName Set that are not in the lastName Set. 
		
		Set<String> firstNameOnly = new HashSet<>(firstNames);
		
		firstNameOnly.removeAll(lastNames);
		
		System.out.println("Elements in FirstName Set Only: " + firstNameOnly);
		
		
		// print elements in the lastName Set that are not in the firstName Set.
		
		Set<String> lastNameOnly = new HashSet<>(lastNames);
		
		lastNameOnly.removeAll(firstNames);
		
		System.out.println("Elements in LastName Set Only: " + lastNameOnly);
		
		
	}

}
