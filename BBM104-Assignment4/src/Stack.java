import java.util.ArrayList;

public class Stack{
    public static ArrayList<Integer> stackList = new ArrayList<>();
    private static int size=100;
    
    Stack() {
    	stackList = new ArrayList<>(size);
    }

    static void push(ArrayList<Integer> stacklist,int value) {//push to top
    	if(!isFull(stacklist))
    		stacklist.add(0,value);
    }
    
    static int pop(ArrayList<Integer> stacklist) {//pop the last stack

         if (!isEmpty(stacklist)) {
        	 int popValue =  stacklist.get(0);
        	 stacklist.remove(0);             
             return popValue;
         } 
         else {
             return -1;
         }
    }

  
     static boolean isEmpty(ArrayList<Integer> stacklist) {//check if is empty
          if (stacklist.isEmpty()){
        	  return true;
          } 
          else{
        	  return false;
          }
     }
     
     static boolean isFull(ArrayList<Integer> stacklist) {//maximum size is 100
         if (stacklist.size() == 100){
       	  return true;
         } 
         else{
       	  return false;
         }
    }

     static int peek(ArrayList<Integer> stacklist) {//peek is top
         return (int) stacklist.get(0);
     } 
     
     
     
     static ArrayList<Integer> sort(ArrayList<Integer> stacklist) {
         if (isEmpty(stacklist)) {
             return null;
         }
         ArrayList<Integer> sortedStack = new ArrayList<Integer>();
         int element = 0;
         
         while(!stacklist.isEmpty()) {//order until stack is empty
             if (peek(stacklist) <= (element = pop(stacklist))) {
                 if (sortedStack.isEmpty()) {
                     push(sortedStack ,element);//is new stack is empty push a number
                 } else {
                     while((!isEmpty(sortedStack)) && peek(sortedStack) < element) {
                         push(stacklist, pop(sortedStack));//if the less one other push the top
                     }
                     push(sortedStack, element);//add new elements
                 }
             }
         }
         
         while(!sortedStack.isEmpty()) {
        	 int i = pop(sortedStack);
        	 Queue.enqueue(stacklist ,i);
         }
         
         return stacklist;
     }
     
     
     static ArrayList<Integer> reverse(int num, ArrayList<Integer> stackList) {

    	if (isEmpty(stackList)) {
             return null;
        }
    	
        ArrayList<Integer> head = new ArrayList<Integer>(stackList.subList(0, num));//separate the two sublist 
    	ArrayList<Integer> tail = new ArrayList<Integer>(stackList.subList(num , stackList.size()));

        ArrayList<Integer> sortedStack = new ArrayList<Integer>();

        while(!head.isEmpty()) {
        	int j = pop(head);//remove the top element and add new stack
        	Queue.enqueue(sortedStack , j);
         }
        
        
        while(!sortedStack.isEmpty()) {//connect new head and tail stack
        	int i = pop(sortedStack);
        	push(tail , i);
        }
        
     	
     	while(!stackList.isEmpty()) {
     		pop(stackList);
     	}
     	
     	while(!tail.isEmpty()) {//update the stacklist
        	int i = pop(tail);
        	Queue.enqueue(stackList , i);
        }
     	

        return stackList;

     }
     static ArrayList<Integer> removeGreater(int num, ArrayList<Integer> stacklist) {
 		
       	 if (stacklist.isEmpty()) {
                return null;
       	 }
         ArrayList<Integer> sortedStack = new ArrayList<Integer>();

         int element = 0;
         
         while(!stacklist.isEmpty()) {
        	 if (num >= (element = Stack.pop(stacklist))) {//if stack is less than num add new stacklist 
        		 push(sortedStack ,element);
             }
         }
         
         while(!sortedStack.isEmpty()) {//update the stacklist
        	 int i = pop(sortedStack);
        	 Queue.enqueue(stacklist ,i);
         }

         return stacklist;
	}
     
     
     public static String ToString()
     {
    	String s ="";
        for(int i : stackList) {
        	 s += i +" ";
        }
        return s;
     }
} 

