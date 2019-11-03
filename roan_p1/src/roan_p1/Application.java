package roan_p1;
import java.io.IOException;
public class Application {

	public static void main(String[] args) throws IOException{
		DuplicateRemover remover = new DuplicateRemover();
		
		String dataFile = "problem1.txt";
		String outputFile = "unique_words.txt";
		
		remover.remove(dataFile);
		remover.write(outputFile);
	}
}
