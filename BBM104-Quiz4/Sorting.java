import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Sorting {
	public static void main(String[] args) throws IOException {
		ArrayList<Contact> al=new ArrayList<Contact>();
		HashSet<Contact> h = new HashSet<Contact>();
        TreeSet<Contact> ts = new TreeSet<Contact>(); 
		TreeSet<Contact> ts1 = new TreeSet<>(new LastNameComparator());// lastnameorder treeset
	    HashMap<String, Contact> hm = new HashMap<String, Contact>();//key = phone number, value = others
	    Main m = new Main();

		try {
			List<String> allLines = Files.readAllLines(Paths.get(m.arg));
			for (String line : allLines) {
				al.add(new Contact(line.split(" ")[0],line.split(" ")[1],line.split(" ")[2],line.split(" ")[3]));
				h.add(new Contact(line.split(" ")[0],line.split(" ")[1],line.split(" ")[2],line.split(" ")[3]));
				ts.add(new Contact(line.split(" ")[0], line.split(" ")[1],line.split(" ")[2],line.split(" ")[3]));
				ts1.add(new Contact(line.split(" ")[0], line.split(" ")[1],line.split(" ")[2],line.split(" ")[3]));
			    Contact b1=new Contact(line.split(" ")[0], line.split(" ")[1],line.split(" ")[2],line.split(" ")[3]);  
				hm.put(line.split(" ")[0],b1);// key = phone number

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileWriter writer1 = new FileWriter("contactsArrayList.txt"); 
		for(Contact el:al) {
			writer1.write(el.getphoneNumber()+" "+el.getFirstName()+" "+el.getlastName()+" "+el.getsocialSecurityNumber()+System.lineSeparator());
		
		}
		writer1.close();
		
		
		FileWriter writer2 = new FileWriter("contactsArrayListOrderByLastName.txt"); 
		Collections.sort(al, new LastNameComparator());    
	    for(Contact el: al){       
				writer2.write(el.getphoneNumber()+" "+el.getFirstName()+" "+el.getlastName()+" "+el.getsocialSecurityNumber()+System.lineSeparator());
	    } 
	    writer2.close();
	    
	    
	    FileWriter writer3 = new FileWriter("contactsHashSet.txt"); 
		for(Contact el:h) {
			writer3.write(el.getphoneNumber()+" "+el.getFirstName()+" "+el.getlastName()+" "+el.getsocialSecurityNumber()+System.lineSeparator());
		}
		writer3.close();
		
		
		FileWriter writer4 = new FileWriter("contactsTreeSet.txt"); 
		for(Contact el:ts) {
			writer4.write(el.getphoneNumber()+" "+el.getFirstName()+" "+el.getlastName()+" "+el.getsocialSecurityNumber()+System.lineSeparator());
		
		}
		writer4.close();
		
		
		FileWriter writer5 = new FileWriter("contactsTreeSetOrderByLastName.txt");       
	     for(Contact el: ts1){       
				writer5.write(el.getphoneNumber()+" "+el.getFirstName()+" "+el.getlastName()+" "+el.getsocialSecurityNumber()+System.lineSeparator());
	     } 
	    writer5.close();
	    
	    
		FileWriter writer6 = new FileWriter("contactsHashMap.txt");       
	    for(Entry<String, Contact> entry:hm.entrySet()){    
	        String key=entry.getKey();  
	        Contact b=entry.getValue();  
			writer6.write(key+" "+b.getFirstName()+" "+b.getlastName()+" "+b.getsocialSecurityNumber()+System.lineSeparator());
	    } 
	    writer6.close();

	}

	
}
