package ecceptionHandling;

import java.io.*;
public class GenerateIoException {

	 public static void main(String[] args) {
		    try {
		      FileReader fr = new FileReader("nonexistentfile.txt");
		    } catch (IOException e) {
		      System.out.println("IOException occurred: " + e.getMessage());
		    }
		  }
}
