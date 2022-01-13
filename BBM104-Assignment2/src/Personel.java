public class Personel{
	protected int totalSalary;// for all of them
	protected int baseSalary = 2600;// to academican and officer
	protected static int ind;//index of array
	protected int severancePay;//for all of them
	protected static String[][] txtarray;
	protected void arraymet() {// to concanate two txt files in a one Array.
		ReadFiles read1 = new ReadFiles();
		String[][] arraynew = new String[read1.arr1.length][read1.arr1[0].length+read1.arr2[0].length];
		for(int i = 0;i<read1.arr1.length;i++) {
			for(int j = 0; j<read1.arr2.length;j++) {
				if(read1.arr1[i][1].equals(read1.arr2[j][0])){
					System.arraycopy(read1.arr1[i], 0, arraynew[i], 0, read1.arr1[i].length);
				    System.arraycopy(read1.arr2[j], 0, arraynew[i], read1.arr1[i].length, read1.arr2[j].length);
				}
			}
		}
		txtarray =arraynew;
		//Calling class by identity numbers
		setarr(txtarray);
		for(int z = 0;z<txtarray.length;z++) {
			if(txtarray[z][1].startsWith("F")){
				setind(z);
				Personel faculty1 = new Academician(); 
				((Academician) faculty1).callFaculty();	
			}	
			else if(txtarray[z][1].startsWith("W")){
				setind(z);
				Personel work1 = new Fulltime(); 
				((Fulltime) work1).callWorker();
			}
			else if(txtarray[z][1].startsWith("S")){
				setind(z);
				Personel sec1 = new Security(); 
				((Security) sec1).salarysec();	
			}
			else if(txtarray[z][1].startsWith("O")){
				setind(z);
				Personel off1 = new Officier(); 
				((Officier) off1).salaryoff();	
			}
			else if(txtarray[z][1].startsWith("C")){
				setind(z);
				Personel chief1 = new Fulltime(); 
				((Fulltime) chief1).callChief();
			}
			else if(txtarray[z][1].startsWith("P")){
				setind(z);
				Personel part1 = new Parttime(); 
				((Parttime) part1).salarypart();	
			}
			else if(txtarray[z][1].startsWith("R")){
				setind(z);
				Personel res1 = new Academician(); 
				((Academician) res1).callReser();

			}
		}
	}
	protected void setind(int se)// set index 
	{this.ind = se;}
	
	protected int getind() // get index from that class to other classes 
	{return ind;}
	
	protected void setarr(String[][] txtarray) 
	{this.txtarray = txtarray;}
	
	protected String[][] getarr()//to access txt1 array to other classes
    {return txtarray;}
    
	public void sevrpaycal(int index) {//
		int year = Integer.parseInt(txtarray[index][3]);
		double calc = (2020 - year) * 20 * 0.8;
		severancePay = (int) calc;		
		setpay(severancePay);// set severancepay			
	}
	
	protected void setpay(int se) 
	{severancePay = se;}
	
	protected int getpay() 
	{return severancePay;}// get severancepay from that class to other classes 
}

