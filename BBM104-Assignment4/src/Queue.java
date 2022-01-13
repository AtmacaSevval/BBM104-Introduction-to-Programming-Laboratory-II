import java.util.ArrayList;

public class Queue{
	public static ArrayList<Integer> queueList = new ArrayList<>();
    private static int size=100;

    
    Queue() {
    	queueList = new ArrayList<>(size);
    }

    
    static void enqueue(ArrayList<Integer> queuelist,int value) {
    	queuelist.add(value);// add the back
    }
    
 
    
    static int dequeue(ArrayList<Integer> queuelist){//remove the front
    	if (!isEmpty(queuelist)) {
    		int popValue = (int) queuelist.get(0);
    		queuelist.remove(0);          
            return popValue;
    	} 
    	else {
            return -1;
        }
    }

  
    static boolean isEmpty(ArrayList<Integer> queuelist){//check if is empty
    	if (queuelist.isEmpty()){
    		return true;
        } 
    	else{
    		return false;
        }
    }

    
    static boolean isFull(ArrayList<Integer> queuelist) {//maximum size is 100
        if (queuelist.size() == 100){
      	  return true;
        } 
        else{
      	  return false;
        }
   }
    
    
    static int peek(ArrayList<Integer> queuelist){//get the front
         return (int) queuelist.get(0);
    }
    
    
    
    static ArrayList<Integer> reverse(int num, ArrayList<Integer> queuelist) {

        if (isEmpty(queuelist)) {
        	return null;
        }
        ArrayList<Integer> head = new ArrayList<Integer>(queuelist.subList(0, num));//separate the two list
        ArrayList<Integer> tail = new ArrayList<Integer>(queuelist.subList(num , queuelist.size()));

        ArrayList<Integer> sortedStack = new ArrayList<Integer>();

        while (!head.isEmpty()) { //add queue new queuelist
        	Stack.push(sortedStack, Stack.peek(head)); 
        	Stack.pop(head); 
        } 
        

        while(!tail.isEmpty()) {
        	int i = dequeue(tail);
        	enqueue(sortedStack , i);
        }
        
        while(!queuelist.isEmpty()) {
        	dequeue(queuelist);
     	}
     	

     	while(!sortedStack.isEmpty()) {
        	int i = dequeue(sortedStack);
        	enqueue(queuelist , i);
        }

        return queuelist;
    }

    static ArrayList<Integer> removeGreater(int num, ArrayList<Integer> queuelist) {
		
      	 if (queuelist.isEmpty()) {
               return null;
      	 }
        ArrayList<Integer> sortedStack = new ArrayList<Integer>();

        int element = 0;
        
        while(!queuelist.isEmpty()) {
       	 if (num >= (element = dequeue(queuelist))) {//if peek is less than num add the queuelist
       		enqueue(sortedStack ,element);
            }
        }
        
        while(!sortedStack.isEmpty()) {
       	 int i = dequeue(sortedStack);
       	 Stack.push(queuelist ,i);
        }
        return queuelist;
	}
    

    
    public static ArrayList<Integer> sort(ArrayList<Integer> queuelist){
    	ArrayList<Integer> tmpqueue = new ArrayList<Integer>();
    	ArrayList<Integer> tmpqueue1 = new ArrayList<Integer>();

    	while(!queuelist.isEmpty()) //order until queue is empty
        { 

            int tmp = dequeue(queuelist); 
          
            while(!tmpqueue.isEmpty() && peek(tmpqueue)  
                                                 < tmp) 
            { 
            	while(!queuelist.isEmpty()) {//is new queue is empty push a number
            		enqueue(tmpqueue1,dequeue(queuelist));//if the less one other push the back
            	}
            	
            	
            	enqueue(queuelist, dequeue(tmpqueue));  
            	while(!tmpqueue1.isEmpty()) {
            		enqueue(queuelist,dequeue(tmpqueue1));
            	}
            	
            }
            	
            	while(!tmpqueue.isEmpty()) {
            		enqueue(tmpqueue1,dequeue(tmpqueue));
            	}
            	
            	enqueue(tmpqueue, tmp); //add new elements
            	
            	while(!tmpqueue1.isEmpty()) {
            		enqueue(tmpqueue,dequeue(tmpqueue1));
            	}
            	
        }         
        while(!tmpqueue.isEmpty()) {
        	enqueue(queuelist, dequeue(tmpqueue));
        }
        return queuelist;
    }


    public static String ToString()
    {
    	String s ="";
        for(int i : queueList) {
        	 s += i +" ";
        }
        return s;
    }
} 
