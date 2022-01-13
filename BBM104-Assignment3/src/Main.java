import java.io.IOException;
public class Main {
	static String arg0;
	public static void main(String[] args) throws IOException {
		arg0 = args[0];
		ReadInput read1 = new ReadInput();//Read input file and convert to arraylists
		read1.main(null);
		ReadFiles read2 = new ReadFiles();// Read read files and convert to arraylists
		read2.main(null);
		DaoPattern pa = new DaoPattern();
		pa.main(null);
		WriteFiles write = new WriteFiles();
		write.main(null);
	}
}

