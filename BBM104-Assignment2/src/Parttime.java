public class Parttime extends Employee{
	public void salarypart() {
		Parttime part2 = new Parttime();
		int index = super.ind;// get super index
		part2.sevrpaycal(index);//severance pay
		hourOfWork(index);
		super.totalSalary = part2.getpay() + hourofwork ;
		txtarray[index][4] = String.valueOf(totalSalary);
	}
}
