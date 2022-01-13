import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaoPattern {
	public void total(int i) {
		int ind = 0;
		int total1 = 0;
		PatientDao p3 = new PatientDao();
		AdmissionDao pd1 = new AdmissionDao();
		ReadInput read1 = new ReadInput();
		String s1 = read1.arr1[i][1];
		
		for(int k = 0;k<pd1.arrlist2.size();k++) {
			String s2 = pd1.arrlist2.get(k);
			if(s2.contains(s1)) {
				ind = k;// indx for patient
			}
		}
		
		p3.arrlist.add("TotalCost for admission " + s1);// call each class from user request.
		for(int y = ind + 1;y<pd1.arrlist2.size();y++) {
			String t1 = pd1.arrlist2.get(y);
			t1 = t1.replaceAll("\t", " ");
			
			if(t1.startsWith("Inpatient")){// if user choose inpatient
				Patients p = new Inpatient();
				if(t1.contains("tests")) {
					p = new Test(p);
				}
				if(t1.contains("doctorvisit")) {
					p = new DoctorVisit(p);
				}
				if(t1.contains("measurements")) {
					p = new Measuring(p);
				}
				if(t1.contains("imagining")) {
					p = new Imagining(p);
				}
				
				int i1 = p.cost();	//for example p=new operation(newoperation2(new examination_type))
				total1 += i1;
				p3.arrlist.add("\t"+ t1 + "" + i1 +"$");//add output the cost
			}
			
			if(t1.startsWith("Outpatient")) {// if patient chooses outpatient
				Patients p1 = new Outpatient();
				if(t1.contains("tests")) {
					p1 = new Test(p1);
				}
				if(t1.contains("doctorvisit")) {
					p1 = new DoctorVisit(p1);
				}
				if(t1.contains("measurements")) {
					p1 = new Measuring(p1);
				}
				if(t1.contains("imagining")) {
					p1 = new Imagining(p1);
				}//for example p=new operation(newoperation2(new examination_type))
				int i2 = p1.cost();
				total1 += i2;
				p3.arrlist.add("\t" + t1 + "" + i2 +"$");//add output the cost
			}
			if(t1.contains(".*\\d+.*")){
				break;//until next user.
			}
		}
		p3.arrlist.add("\t" + "Total: " + total1 + "$");// total
	}	
	public static void main(String[] args) throws IOException {
		ReadInput read2 = new ReadInput();
		PatientDao pd = new PatientDao();
		AdmissionDao pd1 = new AdmissionDao();
		DaoPattern pa = new DaoPattern();
		
		for(int i = 0;i<read2.arr1.length;i++) {
			String s1 = read2.arr1[i][0];
			if(s1.equals("AddPatient")){
				pd.add(i);//Add the patient to output and patient text files.
			}	
			if(s1.equals("RemovePatient")) {// remove in admission and patient
				pd.deleteById(i);
				pd1.deleteById(i);
			}
			if(s1.contentEquals("ListPatients")) {
				List<String> rt = new ArrayList<String>();
				rt = pd.arrlist1;//call patient array
				Collections.sort(rt, (name1, name2) -> name1.split("\t")[1].compareTo(name2.split("\t")[1]));// order from their names.
				pd.arrlist.add("Patient List: ");
				for(int p = 0;p<rt.size();p++) {
					String str = rt.get(p).replaceAll("\t", " ");
					pd.arrlist.add((String) str);// add output array
				}
			}
			if(s1.equals("CreateAdmission")) {
				pd1.createAd(i);//for input create admission
			}
			if(s1.equals("AddExamination")){//add examination in admission file.
				pd1.add(i);
			}	
			if(s1.equals("TotalCost")) {// call examination total cost
				pa.total(i);			
			}	
		}
       
	}
}



