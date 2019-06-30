package prop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingToPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		File f=new File("C:\\Resume\\Java\\src\\prop\\Prop1.properties");
		FileOutputStream FOS=new FileOutputStream(f);
		p.setProperty("Name","Ujjwal");
		p.setProperty("Place","Bihar");
		p.setProperty("Town","Bagaha");
		p.setProperty("Msg","How are you");
		p.store(FOS,null);
		System.out.println("Wrote Successsfully");
	}

}
    
           