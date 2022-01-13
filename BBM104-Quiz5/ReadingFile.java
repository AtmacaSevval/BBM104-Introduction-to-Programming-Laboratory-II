import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFile {
	static ArrayList<Integer> nums = new ArrayList<>();
	public static void read(ArrayList<Integer> nums) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(new File(Main.arg)));
        
        String line;
        
        while((line = br.readLine())!= null){
        		int line1 = Integer.valueOf(line);
        		nums.add(line1);

        }		
        br.close();
        
	}
		
   
	public static void main(String[] args) throws IOException {
		read(nums);

	}

}
