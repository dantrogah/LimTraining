package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromCsv {

	public static void main(String[] args) throws IOException {
		
		
		List<String[]>  textResult = new ArrayList<>();
		
		String textRes = "";
 		// open file
		
		FileReader fr = new FileReader("C:\\Users\\toshiba\\Documents\\java_files\\report.csv");
				
		BufferedReader br = new BufferedReader(fr );
		
		// read file 
		
		while((textRes = br.readLine()) != null){
			
			String[] printResult = textRes.split(",");
			
			textResult.add(printResult);			
		}
		
		// print CSV
		for(String[] result : textResult){
			
			for(String row : result){
				
				System.out.println(row );
			}
			
		}
		
		br.close();
		
		
		
		

	}

}
