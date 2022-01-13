import java.io.IOException;

public class Main {
	static String arg;
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		arg =  args[0];
		ReadingFiles.main(null);
		
		Commands.main(null);
		
		WritingFiles.main(null);
    	    	
	}
} 

