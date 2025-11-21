
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("art.txt");
			writer.write("(-_-)");
			writer.append("\n(Art!)");
			writer.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}