import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DecimaltoOc {
	
	
	public static void setOct2Stack(int num) {
		if (num == 0) {
			Stack.push(Stack.stackList,0);
	    }
		
	    while (num > 0) {
	    	
	    	int digit = num % 8;
	        Stack.push(Stack.stackList,digit);
	        num = num / 8;
	    	
	    }
	}
	
	
	public static void main(String[] args) throws IOException {
		
		
		while(!Stack.isEmpty(ReadingFile.nums)) {
			int num = Stack.top(ReadingFile.nums);
			setOct2Stack(num);
			
	        int size = Stack.size(Stack.stackList);
	        
	        File file = new File("octal.txt");
	        FileWriter fr = new FileWriter(file, true);
	        String sr = "";
	        
	        for(int i:Stack.stackList) {
	        	sr += Integer.toString(i);
	        }
	        
	        fr.write(sr);
	        fr.write("\n");
    		fr.close();
    		
    		
	        while(0 < size) {
	        	Stack.pop(Stack.stackList);
	        	size--;
	        }
	        
			Stack.pop(ReadingFile.nums);
		}
		
	}
		
}
