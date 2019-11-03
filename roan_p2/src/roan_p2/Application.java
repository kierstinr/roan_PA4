package roan_p2;
import java.io.IOException;

public class Application {
	public static void main(String[] args) throws IOException{
		DuplicateCounter counter = new DuplicateCounter();
		
		String dataFile = "problem2.txt";
		String outputFile = "unique_word_counts.txt";
		
		counter.count(dataFile);
		counter.write(outputFile);

	}
}

