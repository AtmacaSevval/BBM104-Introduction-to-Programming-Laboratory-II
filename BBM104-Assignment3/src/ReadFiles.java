import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFiles {
	public static void main(String[] args) {
		ArrayList<String> list2=new ArrayList<String>();//To add each line in first file I create an arraylist.
		ArrayList<String> list3=new ArrayList<String>();//To add each line in second file I create an arraylist.
        try (BufferedReader br = new BufferedReader(new FileReader("patient.txt")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                list2.add(sCurrentLine);//add each line int first txt file
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
        try (BufferedReader br = new BufferedReader(new FileReader("admission.txt")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                list3.add(sCurrentLine);//add each line int second txt file
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        
		PatientDao p = new PatientDao();
		AdmissionDao a= new AdmissionDao();
		p.arrlist1= list2 ;// in PatientDao
		a.arrlist2 = list3;//in AdmissionDao
    }

}
