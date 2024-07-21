package propetyFileRelated;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFilePra {

	public static void main(String[] args) throws IOException {
		
		Properties pro=new Properties();
		
		String filepath = System.getProperty("user.dir")+"\\src\\test\\resources\\pra.properties";
		
		FileInputStream fis=new FileInputStream(filepath);
		
		String country = pro.getProperty("country");
		String president = pro.getProperty("president");
		String population = pro.getProperty("population");
		
		pro.load(fis);
		
		fis.close();
		
		for(String key: pro.stringPropertyNames())
		{
			System.out.println(key +" "+pro.getProperty(key));
		}

	}

}
