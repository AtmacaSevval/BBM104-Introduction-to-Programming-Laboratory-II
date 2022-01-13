import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WriteFiles {
    static String str1;
	public static void main(String[] args) throws IOException {
		PatientDao pd = new PatientDao();
		AdmissionDao pd1 = new AdmissionDao();
		Collections.sort(pd.arrlist1, new Comparator<String>() {// order from admissionId in patient text file
			public int compare(String s1, String s2) {
				return Integer.valueOf(s1.split("\t")[0]).compareTo(Integer.valueOf(s2.split("\t")[0]));
			}
		});
		
		FileWriter fwOb = new FileWriter("patient.txt", false); 
		PrintWriter pwOb = new PrintWriter(fwOb, false);// delete all lines in text file
		pwOb.flush();
		pwOb.close();
		fwOb.close();
		FileWriter writer = new FileWriter("patient.txt"); 
		for(String str: pd.arrlist1) {// add arraylist in file.
			writer.write(str + System.lineSeparator());
		}
		writer.close();
    
    
		
		List<String> dene = new ArrayList<String>();
		int size1 = pd1.arrlist2.size();// order admission text file
    
		for(int t = 1;t<pd1.arrlist2.size();t++) {
			try {
    		
				if(pd1.arrlist2.get(t).matches(".*\\d.*")) {
					dene.add(str1);
					str1 ="";
					str1 += pd1.arrlist2.get(t);
				}
				if(pd1.arrlist2.get(t).matches(".*\\d.*") == false){
					str1 += "\n" + pd1.arrlist2.get(t);
				}
				if(t== size1 - 1) {
					dene.add(str1);        
				}
			}catch(ArrayIndexOutOfBoundsException exception) {}
		}
		
		String s = dene.get(0);
		s = pd1.arrlist2.get(0) +" "+s;
		s = s.replace("null", "");
		dene.set(0, s);
		
		Collections.sort(dene, new Comparator<String>() {// order from admissionId
			public int compare(String s1, String s2) {
				return Integer.valueOf(s1.split("\t")[0].replace("\n","")).compareTo(Integer.valueOf(s2.split("\t")[0].replace("\n","")));
			}
		});
    
		FileWriter fwOb1 = new FileWriter("admission.txt", false); 
		PrintWriter pwOb1 = new PrintWriter(fwOb, false);// delete all lines in admission text file and add arraylist 
		pwOb1.flush();
		pwOb1.close();
		fwOb1.close();
		FileWriter writer1 = new FileWriter("admission.txt"); 
		for(String str: dene) {
			writer1.write(str + System.lineSeparator());
		}
		writer1.close();
    
    
		FileWriter writer2 = new FileWriter("output.txt"); 
		for(String str: pd.arrlist) {// add output array
			writer2.write(str + System.lineSeparator());
		}
		writer2.close();
}
}
