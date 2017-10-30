package revision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {

	public static void main(String[] args) {
		
		List<String[]>  file = new ArrayList<String[]>();
	
		// file path
		String filename = "C:\\Users\\toshiba\\Documents\\web_devopment\\accounts.csv";
		
		String dataRow;
		
		// Open the file 
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// read the file as long as the file content is not empty.
				while((dataRow = br.readLine()) != null){
					
					String[] line = dataRow.split(",");
					
					file.add(line);
					
					
				}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}catch (IOException e){
			
			e.printStackTrace();
		}
		
		
		
		for(String[] account : file){
			
			for(String field : account){
				
				System.out.println(field);
			}
		}
		
	}

}
