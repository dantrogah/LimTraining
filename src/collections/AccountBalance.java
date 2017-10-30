package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "";
		List<String[]>  read = new ArrayList<>();
		
		try {
			
			FileReader fr = new FileReader("C:\\Users\\toshiba\\Documents\\java_files\\status.csv");
			
			BufferedReader br = new BufferedReader(fr);
			
			
			
			while((text = br.readLine()) != null){
				
				String[] splitResult = text.split(",");
				
				read.add(splitResult);				
				
			}
			
			System.out.println(text);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		double balance = 0;
		
		for(String[] readItem : read){
			
			String date = readItem[0];
			String type = readItem[1];
			String vendor = readItem[2];
			double amount = Double.parseDouble(readItem[3]);
			
			System.out.print(date + " | " + type + " | " + vendor + " | $" + amount);
			
			if(type.equalsIgnoreCase("credit")){
				//System.out.println("Add to balance");
				balance += amount;
				
				
			}else if(type.equalsIgnoreCase("debit")){
				
				//System.out.println("Subtract from balance");
				balance -= amount;
				
			}else {
				
				//System.out.println("Another transaction");
				balance += 0;
			}
			
			System.out.print(" | Balance " + balance + "\n");
		
		}
		
		System.out.println();
		
		if(balance > 0){
			
			System.out.println("Your balance is " + balance + "\n" + 
			"You are charged a 10% fee of $" + balance*.1  + "\n" + 
			"Your new balance is $" + ( balance + (balance*.1)));
			
		}else if(balance < 0 ){
			
			System.out.println("Thanks for the payment " + "\n" +
			"You made an overpayment of " + balance);
		}else{
			
			System.out.println("Thanks for the payment");
		}
		
	}

}
