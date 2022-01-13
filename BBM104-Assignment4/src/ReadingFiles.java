import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadingFiles {
	static ArrayList<String> list2=new ArrayList<String>();//To add each line in first file I create an arraylist.

	public static void main(String args[]) throws NumberFormatException, IOException 
	{
		try (BufferedReader br3 = new BufferedReader(new FileReader(Main.arg)))
	    {
			String sCurrentLine;
	        while ((sCurrentLine = br3.readLine()) != null) {
	        	list2.add(sCurrentLine);//append commands in arraylist
	        }
			br3.close();

	    } 
		catch (IOException e){
			e.printStackTrace();
	    }

		
		BufferedReader br = new BufferedReader(new FileReader(new File("stack.txt")));
        List<Integer>list = new ArrayList<Integer>();
        
        String line;
        
        while((line = br.readLine())!= null){
        	String [] r = line.split(" ");//separating each number
        	for(int i = 0; i < r.length; i++){
        		int val = Integer.parseInt(r[i]);
        		list.add(val);
        		
        	}
        }		br.close();
        
        Collections.reverse(list);
        for(Integer i:list) {
        	Stack.push(Stack.stackList,i);//input push stacklist 
        }

        
        BufferedReader br1 = new BufferedReader(new FileReader(new File("queue.txt")));
        List<Integer>list1 = new ArrayList<Integer>();
        
        String line1;
        
        while((line1 = br1.readLine())!= null){
        	String [] r1 = line1.split(" ");//separating each number 
        	for(int i = 0; i < r1.length; i++){
        		int val = Integer.parseInt(r1[i]);
        		list1.add(val);
        		
        	}
        }		br1.close();
        
        for(Integer i:list1) {//input push in queuelist
        	Queue.enqueue(Queue.queueList,i);
        }
        
	}
}
