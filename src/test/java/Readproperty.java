import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.checkerframework.checker.units.qual.t;
import org.testng.annotations.Test;

public class Readproperty {

	public static void main(String[] args) throws IOException {
		
		
		Properties ss=new Properties();
		
		FileInputStream dd=new FileInputStream("C:\\Users\\Neosoft\\eclipse-workspace\\Automationproject\\src\\test\\java\\Read\\sss.properties");
		ss.load(dd);
		System.out.println(ss.getProperty("name"));
		System.out.println(ss.getProperty("date"));
		
		FileInputStream d=new FileInputStream("C:\\Users\\Neosoft\\eclipse-workspace\\Automationproject\\src\\test\\java\\Read\\sss.properties");
		ss.setProperty("sdsdada", "20-2-2023");
		ss.store(d, "fgefyegfg");
		
		
		
		
	}
}
