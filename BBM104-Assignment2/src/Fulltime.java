public class Fulltime extends Employee{
	protected int overWorkSalary;
	protected int dayOfWork(int x) {// x TL/per days
		return x * 20;
	}
	protected void overWorkSalary(int i,int h,int p) {// h= hour; p=payment; i=index
		Fulltime per1 = new Fulltime();
		per1.getarr();// get txt1 array
		int week1 = Integer.parseInt(per1.getarr()[i][5]);
		int week2 = Integer.parseInt(per1.getarr()[i][6]);
		int week3 = Integer.parseInt(per1.getarr()[i][7]);
		int week4 = Integer.parseInt(per1.getarr()[i][8]);
		int w1 =week1 - 40;int w2 =week2 - 40;int w3 =week3 - 40;int w4 =week4 - 40;// 40 hours + addCourseFeeHours
		if(w1 > 0 && w1<=h){ 
			overWorkSalary += w1 *p;
		}
		else if(w1 > h) {
			overWorkSalary += h * p;
		}
		if(w2 > 0 && w2<=h){
			overWorkSalary += w2 *p;
		}
		else if(w2 > h) {
			overWorkSalary += h * p;
		}
		if(w3 > 0 && w3<=h){
			overWorkSalary += w3 *p;
		}
		else if(w3 > h) {
			overWorkSalary += h * p;
		}
		if(w4 > 0 && w4<=h){
			overWorkSalary += w4 *p;
		}
		else if(w4 > h) {
			overWorkSalary += h * p;
		}
	}

	public void callWorker() {//Calling Worker
		Worker work2 = new Worker(); 
		work2.salarywork();
	}
	
	public void callChief() {//Calling Chief
		Chief chief2 = new Chief(); 
		chief2.salarychief();
	}
}
