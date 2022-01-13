import java.util.ArrayList;


public class Stack {
	public static ArrayList<Integer> stackList = new ArrayList<>();
    
    Stack() {
    	
    }

    static void push(ArrayList<Integer> list,int value) {
    	if(!isFull(list)) {
    		list.add(0,value);
    	}
    	else {
    		System.out.println("The stack is full!!");
    	}
    }
    
    static int pop(ArrayList<Integer> list) {
    	
    	int popValue =  list.get(0);
        list.remove(0);             
        return popValue;
    }
    
    static int top(ArrayList<Integer> list) {
        return (int) list.get(0);
    }
    
    static boolean isFull(ArrayList<Integer> list) {
        if (list.size() == 10){
      	  return true;
        } 
        else{
      	  return false;
        }
   }
    
    static boolean isEmpty(ArrayList<Integer> list) {
        if (list.isEmpty()){
      	  return true;
        } 
        else{
      	  return false;
        }
   }
    
    static int size(ArrayList<Integer> list) {
    	return list.size();
    }
}
