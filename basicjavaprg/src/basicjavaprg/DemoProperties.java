package basicjavaprg;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class DemoProperties {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\neerj\\eclipse-workspace\\basicjavaprg\\src\\basicjavaprg\\abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("venki");
		System.out.println(s);
		p.setProperty("nag", "99999");
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()) {
			String s1 = (String)e.nextElement();
			System.out.println(s1);
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\neerj\\eclipse-workspace\\basicjavaprg\\src\\basicjavaprg\\abc.properties");
		p.store(fos, "updated by neerja for properties class demo");
	}

}
