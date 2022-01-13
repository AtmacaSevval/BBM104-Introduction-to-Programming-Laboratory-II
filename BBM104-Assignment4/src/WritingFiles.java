import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		FileWriter writer1 = new FileWriter("stackOut.txt"); //write the two files stack and queue
		for(String str: Commands.stackoutput) {
			writer1.write(str + System.lineSeparator());
		}
		writer1.close();
		
		FileWriter writer = new FileWriter("queueOut.txt"); 
		for(String str: Commands.queueoutput) {
			writer.write(str + System.lineSeparator());
		}
		writer.close();
		
		PrintWriter writer3 = new PrintWriter("stack.txt");
		writer3.write(Stack.ToString() + System.lineSeparator());
        writer3.close(); 
         
        PrintWriter writer4 = new PrintWriter("queue.txt");
		writer4.write(Queue.ToString() + System.lineSeparator());
        writer4.close(); 

	}

}
