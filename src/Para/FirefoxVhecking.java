package Para;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirefoxVhecking {
public static void main(String[] arg) throws IOException  {
	System.setProperty("webdriver.driver.chromedriver","D:\\Software\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	FileInputStream path=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Parameter");
	Properties pro=new Properties();
	pro.load(path);
	driver.get(pro.getProperty("url"));
	
	
	
}

	
	
}
