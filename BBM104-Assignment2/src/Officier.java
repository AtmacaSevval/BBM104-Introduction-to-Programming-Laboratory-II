public class Officier extends Personel{
	protected int ssBenefits;
	private int overWork;
	private void overWork(int i) {
		Personel per1 = new Personel();
		per1.getarr();
		int week1 = Integer.parseInt(per1.getarr()[i][5]);int week2 = Integer.parseInt(per1.getarr()[i][6]);int week3 = Integer.parseInt(per1.getarr()[i][7]);int week4 = Integer.parseInt(per1.getarr()[i][8]);
		int w1 =week1 - 40;int w2 =week2 - 40;int w3 =week3 - 40;int w4 =week4 - 40;
		if(w1 > 0 && w1<=10){
			overWork += w1 *20;
		}
		else if(w1 > 10) {
			overWork += 200;
		}
		if(w2 > 0 && w2<=10){// if more than 10 hours even though we calculate not more than 10 hours
			overWork += w2 *20;
		}
		else if(w2 > 10) {
			overWork += 200;
		}
		if(w3 > 0 && w3<=10){
			overWork += w3 *20;
		}
		else if(w3 > 10) {
			overWork += 200;
		}
		if(w4 > 0 && w4<=10){
			overWork += w4 *20;
		}
		else if(w4 > 10) {
			overWork += 200;
		}
	}
	protected void officierbenefits() {
		int i = baseSalary * 65 /100;
		setben(i);// set ssBenefits
	}
	
	protected void setben(int i) {
		ssBenefits = i; 
	}
	
	protected int getben() {
		return ssBenefits;
	}
	
	public void salaryoff() {
		Officier off2 = new Officier();
		int index = super.ind;// get super index form super class
		off2.sevrpaycal(index);//severance pay
		off2.officierbenefits();//%65
		overWork(index);
		super.totalSalary = super.baseSalary + off2.getben() + off2.getpay() + overWork;
		txtarray[index][4] = String.valueOf(totalSalary);
	}
}
