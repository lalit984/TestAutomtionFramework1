package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr =new FileReader("C:\\Users\\Divyansh Sharma\\eclipse-workspace\\TestAutomationFramework1\\src\\test\\java\\configFiles");
		Properties p =new Properties();
		
		p.load(fr);
				

	}

}
