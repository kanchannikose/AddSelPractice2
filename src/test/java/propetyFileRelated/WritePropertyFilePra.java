package propetyFileRelated;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFilePra {

	public static void main(String[] args) throws IOException {
	 
		Properties pro=new Properties();
		
		String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\pra.properties";
		
		FileOutputStream fos=new FileOutputStream(filepath);
		
		pro.setProperty("country", "USA");
		pro.setProperty("president", "joe biden");
		pro.setProperty("population", "33.33cr");
		
		pro.store(fos, "this is sample data");
		
		fos.close();
		
		System.out.println("The data has been written successfully");

	}

}
