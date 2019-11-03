package roan_p2;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class DuplicateCounter {
	private String wordCounter;

	public void count(String dataFile) throws IOException{
	      FileInputStream fileByteStream = null;
	      Scanner inFS = null;
 
	      String[] fileWord = new String[100];
	      int i = 0, numWords, j;
	      int[] countArr = new int[100];
	      HashMap<String, Integer> wordsCounted = new HashMap<String, Integer>();
	      
	      fileByteStream = new FileInputStream(dataFile);
	      inFS = new Scanner(fileByteStream);
	      
	      while (inFS.hasNextLine()) {
	          fileWord[i] = inFS.next();
	          i++;
	       }
	      
	      numWords = i;
	      
	      for (i = 0; i < numWords; i++) {
	    	  for (j = 0; j < numWords; j++) {
	    		  if (fileWord[i].compareTo(fileWord[j]) == 0) {
	    			  countArr[i]++;
	    		  }
	    	  }
	      }
	      
	      for(i = 0; i < numWords; i++) {
	    	  wordsCounted.put(fileWord[i], countArr[i]);
	      }
	      
	      wordCounter = wordsCounted.toString();
	      
	      fileByteStream.close();
	      inFS.close();
	}

	public void write(String outputFile) throws IOException{
	      FileOutputStream fileByteStream = null;
	      PrintWriter outFS = null; 
	      
	      fileByteStream = new FileOutputStream(outputFile);
	      outFS = new PrintWriter(fileByteStream);
	      
	      outFS.println(wordCounter);
	      outFS.flush();

	      fileByteStream.close();   
	}
}
