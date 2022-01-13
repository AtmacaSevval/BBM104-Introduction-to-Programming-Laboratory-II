public class Chief extends Fulltime{
	public void salarychief() {
		Chief chief3 = new Chief();
		int index = super.ind;// get super index
		chief3.sevrpaycal(index);
		int d = dayOfWork(125);//125 Tl/per days
		super.overWorkSalary(index,8,15);////maximum 10 hours and 11TL per/hours
		super.totalSalary = chief3.getpay() + d + overWorkSalary;
		txtarray[index][4] = String.valueOf(totalSalary);
	}
}
