public class Worker extends Fulltime{
	public void salarywork() {
		Worker work3 = new Worker();
		int index = super.ind;// get super index
		work3.sevrpaycal(index);
		int d = dayOfWork(105);//105 Tl/per days
		super.overWorkSalary(index,10,11);//maximum 10 hours and 11TL per/hours
		super.totalSalary = work3.getpay() + d + overWorkSalary;
		txtarray[index][4] = String.valueOf(totalSalary);
	}
}
