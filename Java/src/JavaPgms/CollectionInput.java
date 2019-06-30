package JavaPgms;
import java.util.ArrayList;
import java.util.Scanner;


public class CollectionInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                ArrayList<String> l=new ArrayList<String>();
                System.out.println("Enter the input");
                Scanner input=new Scanner(System.in);

                 String a =input.nextLine();
                 l.add(a);
       // use this to iterate the value inside the arraylist.
      /* for (int i = 0; i < l.size(); i++) {
          System.out.println(l.get(i));
              } */
                    System.out.println(l);
                    l.remove(0);
                    System.out.println(l);
                   // l.lastIndexOf(l);
                    //System.out.println(l);
            }

	}

