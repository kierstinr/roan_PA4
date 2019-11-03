package roan_p1;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class DuplicateRemover {
	private String uniqueWords;

	public void remove(String dataFile) throws IOException{
	      FileInputStream fileByteStream = null;
	      Scanner inFS = null;
 
	      String fileWord;
	      HashSet<String> wordsInFile = new HashSet<String>();
	      
	      fileByteStream = new FileInputStream(dataFile);
	      inFS = new Scanner(fileByteStream);
	      
	      while (inFS.hasNextLine()) {
	          fileWord = inFS.next();
	          wordsInFile.add(fileWord);
	       }
	   
	    	  uniqueWords = wordsInFile.toString();
	      
	      fileByteStream.close();
	      inFS.close();
	}

	public void write(String outputFile) throws IOException{
	      FileOutputStream fileByteStream = null;
	      PrintWriter outFS = null; 
	      
	      fileByteStream = new FileOutputStream(outputFile);
	      outFS = new PrintWriter(fileByteStream);
	      
	      outFS.println(uniqueWords);
	      outFS.flush();

	      fileByteStream.close();   
	}
}
