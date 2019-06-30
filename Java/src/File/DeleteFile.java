package File;
import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\kumaujjv\\Downloads\\utsaw.txt");
		if(f.delete()){
			System.out.println("File Deleted");			
		}
		else{
			System.out.println("Didn't Deleted");
		}

	}

}
