package ecceptionHandling;
import java.io.*;
public class FileNotFound {
	
	public static void main(String[] args) {
	    try {
	      File file = new File("nonexistentfile.txt");
	      FileReader fr = new FileReader(file);
	    } catch (FileNotFoundException e) {
	      System.out.println("FileNotFoundException occurred: " + e.getMessage());
	    }
	  }

}
