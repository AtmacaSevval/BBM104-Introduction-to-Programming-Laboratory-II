public class FacultyMember extends Academician{
	private int addCourseFee;
	private void addCourseFee(int i) {
		FacultyMember faculty3 = new FacultyMember();
		faculty3.getarr();
		int week1 = Integer.parseInt(faculty3.getarr()[i][5]);
		int week2 = Integer.parseInt(faculty3.getarr()[i][6]);
		int week3 = Integer.parseInt(faculty3.getarr()[i][7]);
		int week4 = Integer.parseInt(faculty3.getarr()[i][8]);
		int w1 =week1 - 40;int w2 =week2 - 40;int w3 =week3 - 40;int w4 =week4 - 40;// 40 hours + addCourseFeeHours
		if(w1 > 0 && w1<=8){
			addCourseFee += w1 *20;
		}
		else if(w1 > 8) {
			addCourseFee += 160;// if more than 8 hours even though we calculate not more than 8 hours
		}
		if(w2 > 0 && w2<=8){
			addCourseFee += w2 *20;
		}
		else if(w2 > 8) {
			addCourseFee += 160;
		}
		if(w3 > 0 && w3<=8){
			addCourseFee += w3 *20;
		}
		else if(w3 > 8) {
			addCourseFee += 160;
		}
		if(w4 > 0 && w4<=8){
			addCourseFee += w4 *20;
		}
		else if(w4 > 8) {
			addCourseFee += 160;
		}
	}
	public void salaryfac() {
		FacultyMember fac1 = new FacultyMember();
		int index = super.ind;// get super index form super class
		fac1.sevrpaycal(index);//severance pay
		fac1.benefits(135);//%135
		addCourseFee(index);
		super.totalSalary = super.baseSalary + fac1.getben() + fac1.getpay() + addCourseFee;
		txtarray[index][4] = String.valueOf(totalSalary);/*you can change with identity numbers because one more identity numbers
		in array*/
	}
		
}

