package propetyFileRelated;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteInPropertyFile {

	public static void main(String[] args) throws IOException {
	
		Properties pro=new Properties();
		pro.setProperty("Dept", "It and Consulting");
		pro.setProperty("Position", "AutomationTester");
		pro.setProperty("Experience", "3yrs");
		pro.setProperty("noticeperiod", "1 month");
		
		String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\example.properties";
        
		FileOutputStream fos=new FileOutputStream(filepath);
		
		pro.store(fos, "sample data for property file");
		
		fos.close();
		
		System.out.println("The data has been created for property file");
	}

}
