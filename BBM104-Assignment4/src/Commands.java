import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;


public class Commands {
	public static ArrayList<String> stackoutput = new ArrayList<String>(); 
	public static ArrayList<String> queueoutput = new ArrayList<String>(); 
	
	public static void main(String[] args) {
		
		for(int i = 0; i<ReadingFiles.list2.size();i++){//call methods by command arraylist
			
			String sr = ReadingFiles.list2.get(i);
			String[] arr = sr.split(" ");


			if(ReadingFiles.list2.get(i).startsWith("S")) {
				if(sr.contains("addOrRemove")){
					stackoutput.add("After " + arr[1] + " " + arr[2] + ":");
					int num = Integer.parseInt(arr[2]);

					
					if(num < 0) {
						while(0 > num) {
							Stack.pop(Stack.stackList);
							num++;
						}
					}
					
					else if(num > 0) {
						while(0 < num) {
							Stack.push(Stack.stackList, ThreadLocalRandom.current().nextInt(1, 50 + 1));
							num--;
						}

					}
					
					stackoutput.add(Stack.ToString());

				}
				
				if(sr.contains("removeGreater")) {
					int num = Integer.parseInt(arr[2]);

					Stack.removeGreater(num,Stack.stackList);
					Collections.reverse(Stack.stackList);
					
					stackoutput.add("After " + arr[1] + " " + arr[2] + ":");
					stackoutput.add(Stack.ToString());

					
					
				}
				
				if(sr.contains("calculateDistance")) {
					int dis = CommonMethods.distance(Stack.stackList);

					stackoutput.add("After calculateDistance:");
					stackoutput.add("Total distance="+Integer.toString(dis));

				}
				
				
				if(sr.contains("distinctElements")) {
					int dis = CommonMethods.distinct(Stack.stackList);
					stackoutput.add("After distinctElements:");
					stackoutput.add("Total distinct element="+Integer.toString(dis));

					
				}
				
				
				
				if(sr.contains("sortElements")){
					
					Stack.sort(Stack.stackList);
					stackoutput.add("After sortElements:");
					stackoutput.add(Stack.ToString());

					
				}
				
				
				else if(ReadingFiles.list2.get(i).contains("reverse")) {
					int num = Integer.parseInt(arr[2]);

					Stack.reverse(num, Stack.stackList);
					
					stackoutput.add("After " + arr[1] + " " + arr[2] + ":");
					stackoutput.add(Stack.ToString());

				}
			}
			
			else if(ReadingFiles.list2.get(i).startsWith("Q")) {
				if(ReadingFiles.list2.get(i).contains("addOrRemove")){
					int num = Integer.parseInt(arr[2]);
					queueoutput.add("After " + arr[1] + " " + arr[2] + ":");
					if(num < 0) {

						while(0 > num) {
							Queue.dequeue(Queue.queueList);
							num++;
							
						}
					}
					
					
					else {
						while(0<num) {
							int randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
							Queue.enqueue(Queue.queueList, randomNum);
							num--;
						}
					}
					queueoutput.add(Queue.ToString());
		
				}
				
				else if(ReadingFiles.list2.get(i).contains("removeGreater")) {
					int num = Integer.parseInt(arr[2]);

					Queue.removeGreater(num, Queue.queueList);
					Collections.reverse(Queue.queueList);
					
					queueoutput.add("After " + arr[1] + " " + arr[2] + ":");
					queueoutput.add(Queue.ToString());

					
				}
				
				else if(ReadingFiles.list2.get(i).contains("calculateDistance")) {
					
					int dis = CommonMethods.distance(Queue.queueList);
					queueoutput.add("After calculateDistance:");
					queueoutput.add("Total distance="+Integer.toString(dis));

					
				}
				
				else if(ReadingFiles.list2.get(i).contains("distinctElements")) {
					int dis = CommonMethods.distinct(Queue.queueList);
					queueoutput.add("After distinctElements:");
					queueoutput.add("Total distinct element="+Integer.toString(dis));
					
				}
				
				else if(ReadingFiles.list2.get(i).contains("reverse")) {
					int num = Integer.parseInt(arr[2]);

					Queue.reverse(num, Queue.queueList);
					
					queueoutput.add("After " + arr[1] + " " + arr[2] + ":");
					queueoutput.add(Queue.ToString());

				}
				
				else if(sr.contains("sortElements")){
					
					Queue.sort(Queue.queueList);
					queueoutput.add("After sortElements:");
					queueoutput.add(Queue.ToString());

					
				}
				
				
			}
		
	    }

	}
}