import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class PatientDao implements Dao{
	static ArrayList<String> arrlist = new ArrayList<String>();
	static ArrayList<String> arrlist1 = new ArrayList<String>();

	public ArrayList<String> getAll() {
		return arrlist1;//arrylist which Patient text file
	}


	public void deleteById(int i) throws IOException{//to remove the patient in patient text file
		int ind = 0;
		
		ReadFiles read2 = new ReadFiles();
		ReadInput read1 = new ReadInput();
		
		String e = read1.arr1[i][1];
		for(int k = 0;k< arrlist1.size();k++) {
			if(arrlist1.get(k).contains(e)) {
				ind = k;//the index 
			}
		}
		
		String arr[] = arrlist1.get(ind).split("\t");//to split name and surname.
		String name = arr[1].split(" ")[0];
		arrlist.add("Patient " + arr[0] +" " +name +" removed"); //to add in output arraylist
		
		arrlist1.remove(ind);// to remove in patient text file.
		
	}		


	public void add(int i) throws IOException{// to add new patient in patient text file
		ReadInput read1 = new ReadInput();
		String add1="";
		add1 = read1.arr1[i][1] + "\t" + read1.arr1[i][2] + " " + read1.arr1[i][3] + "\t" + read1.arr1[i][4] + "\t" + "Address:";//for add patient text file
		
		for(int p = 5;p<read1.arr1[i].length;p++){
			add1 += " " + read1.arr1[i][p];// to add address
		}
		
		arrlist1.add(add1);//add new patient
		arrlist.add("Patient " + read1.arr1[i][1] +" " + read1.arr1[i][2] + " added");//add output arraylist.
	}

	

	

}
