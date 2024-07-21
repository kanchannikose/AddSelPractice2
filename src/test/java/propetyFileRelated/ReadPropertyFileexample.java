package propetyFileRelated;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFileexample {

	public static void main(String[] args) throws IOException {
		
		Properties pro=new Properties(); //create object of properties
		
		String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\example.properties";
        
		FileInputStream fis=new FileInputStream(filepath); //reading-FileInputStream
		
		pro.load(fis); //load the file
		
		fis.close();
		
		String experience= pro.getProperty("Experience");
		String dept= pro.getProperty("Dept");
		String position=pro.getProperty("Position");
		String noticeperiod=pro.getProperty("noticeperiod");
		
		System.out.println(experience +" "+dept+" "+position+" "+noticeperiod);
		
		for(String key: pro.stringPropertyNames())
		{
			System.out.println(key+" :- "+pro.getProperty(key));
		}
	}

}
