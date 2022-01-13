import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonMethods{

    static int distance(ArrayList<Integer> list) {//common with queue and stack

    	ArrayList<Integer> l1 = new ArrayList<Integer>();
    	ArrayList<Integer> l2 = new ArrayList<Integer>();
    	
    	for(int i : list) {
    		Queue.enqueue(l2, i);
    	}
    	
     	int x = 0;
     	int dis = 0;
 		final int size1 = list.size();

     	for(int i = 0; i <size1 ; i++ )
     	{	
     		final int size = list.size() - 1;
     		int d = Stack.pop(list);//remove
     		int x2 = x;
     		while(x2 < size) {// Take peek and calculate the distance until stack is blank
     			int x1 = d - Queue.peek(list);
     			int d1 = Stack.pop(list);
     			x1 = Math.abs(x1);dis += x1;
     			x2++; 
     			Queue.enqueue(l1, d1);
     		}
     		
     		while(!list.isEmpty()) {
         		Stack.pop(list);
         	}
     		
     		for(int k = 0;k<l1.size();k++) {
     			Queue.enqueue(list,l1.get(k));
     		}
     		
     		while(!l1.isEmpty()) {
         		Stack.pop(l1);
         	}
     	}
     	
     	while(!l2.isEmpty()) {
     		int i = Stack.pop(l2);
     		Queue.enqueue(list ,i);
        }
        
 		return dis;
    }
    

    
    static int distinct(ArrayList<Integer> list) {//common with queue and stack
    	Set<Integer> itemNames = new HashSet<Integer>();//set is unique so, convert to set
    	for (int item : list)
    	    itemNames.add(item);
    	int numUnique = itemNames.size();
    	return numUnique;
    	
    }
    
 
}
