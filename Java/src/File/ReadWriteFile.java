package File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {
	public static void main(String[] args) throws IOException {
//		Create New File
		File f = new File("C:\\Users\\kumaujjv\\Downloads\\utsaw.txt");
		f.createNewFile();
		System.out.println("File Created");
			
		//Write on the File
		FileWriter writer = new FileWriter("C:\\Users\\kumaujjv\\Downloads\\utsaw.txt");
		BufferedWriter out = new BufferedWriter(writer);
		out.write("Hello utsaw");
//		out.flush();
		out.write(" How are You");
		out.flush();
////////////	Helps you to move to next line
		out.newLine();
		out.flush();
		out.write("This is a New line");
		System.out.println("File Written");
		out.flush(); //This command helps you to store all the values to Text file which you passed
		out.write(" Hello i m writting");
		out.write(" 72 "); 
		out.write(72); //Ascii character value will be taken
		out.flush();
		System.out.println("File Written");
		writer.close();
		out.close();
//		out.write("hello");
//		out.flush();
		
		//Read from File
		FileReader r = new FileReader("C:\\Users\\kumaujjv\\Downloads\\utsaw.txt");
		BufferedReader bfr = new BufferedReader(r);
		/*System.out.println(bfr.read());// Ascii value of the first character
		System.out.println(bfr.read());// Ascii value of the second character
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());*/
		//Using a loop to read the line
		String x ="";
		while((x=bfr.readLine())!=null)
		{
			System.out.println(x);
		}

		System.out.println("File Read");

	}

}