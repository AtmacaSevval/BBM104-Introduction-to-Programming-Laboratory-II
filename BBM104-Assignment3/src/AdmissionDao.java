import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdmissionDao implements Dao {
	static ArrayList<String> arrlist2 = new ArrayList<String>();

	public ArrayList<String> getAll() {// arraylist for Admission txt
		return arrlist2;
	}

	public void createAd(int i) {//create new admission
		ReadInput read1 = new ReadInput();
		PatientDao p1 = new PatientDao();
		
		String add = read1.arr1[i][1] + "\t" + read1.arr1[i][2];
		arrlist2.add(add);// add addmissionId and patientId in admission txt file.
		p1.arrlist.add("Admission " + read1.arr1[i][1] + " created");// add output create admission	
	}

	@Override
	public void add(int i) throws IOException {//add examination
		ReadInput read1 = new ReadInput();
		PatientDao p1 = new PatientDao();
		String add3 = "";
		add3 += read1.arr1[i][2] + "\t";// tab after examination type
		
		for(int p = 3;p<read1.arr1[i].length;p++){
			add3 += read1.arr1[i][p] +" ";
		}
		arrlist2.add(add3);//add examinations and operations in admission text file.
			
		p1.arrlist.add(read1.arr1[i][2] + " examination added to admission " + read1.arr1[i][1]);// output for add examination
		
	}

	@Override
	public void deleteById(int i) throws IOException {// remove admission in text file
		ArrayList<Integer> listdel=new ArrayList<Integer>();
		ReadInput read1 = new ReadInput();

		int ind = 0;
		String e = read1.arr1[i][1];

		for(int k = 0;k<arrlist2.size();k++) {// find user index
			if(arrlist2.get(k).contains(e)) {
				ind = k;
			}
		}
		arrlist2.remove(ind);

		
		for(int k = ind ;k<arrlist2.size();k++) {// to remove user examinations and operations in admission txt.
			String dig = arrlist2.get(k);
		
			try {
				if(arrlist2.get(k).contains("Inpatient") || arrlist2.get(k).contains("Outpatient")){
					listdel.add(k);
				}
					
				else if(dig.matches(".*\\d+.*")){//to remove patient until next user.
					break;
				}
			}catch(IndexOutOfBoundsException exception) {}
				
		}
		
		for(int t = 0 ;t<listdel.size();t++) {
			int sub = listdel.get(t);
			sub -= t;
			listdel.set(t , sub);	//add examinations and operations which is removed
		}
		
		for(int obj:listdel) {
			arrlist2.remove(obj);// remove examinations and operations
		}
		
		
	}


}
