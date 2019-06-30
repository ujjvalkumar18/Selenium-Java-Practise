package File;
import java.io.File;

public class FileLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\kumaujjv\\Downloads\\utsaw.txt");
		if(f.exists()){
			System.out.println("File Exists");	
		}
		else{
			System.out.println("File Doesn't Exists");
		}
	}
}
