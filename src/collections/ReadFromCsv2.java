package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromCsv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String[]> dataRow	=	new ArrayList<>();
		String textResult = "";
		
		try {
			// class to access file 
			FileReader 	fr = new FileReader("C:\\Users\\toshiba\\Documents\\java_files\\report.csv");
			
			// class to read the file access
			BufferedReader br = new BufferedReader(fr);
			
			
			// using the Readline() method to read file line by line
			
			while ((textResult = br.readLine()) != null){
				
				String[] finalResult = textResult.split(",");
				
				dataRow.add(finalResult);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		 for(String[] bb: dataRow){
			 
			 for(String text : bb){
				 
				 System.out.println(text);
				 
			 }
			 
		 }
	}

}
