package prop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiesFile {
	public static void main(String args[]) throws IOException{

		Properties p=new Properties();//Properties is a class defined inside util pacakage.
		//File f=new File(System.getProperty("user.dir")+"\\src\\prop\\Test.properties");
		File f=new File("C:\\Resume\\Java\\src\\prop\\Prop1.properties");
		FileInputStream fis=new FileInputStream(f);
		p.load(fis);
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("Place"));
		System.out.println(p.getProperty("City"));
	}
}

