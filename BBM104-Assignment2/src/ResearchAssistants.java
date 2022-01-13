public class ResearchAssistants extends Academician{
	public void salaryres() {
		ResearchAssistants res1 = new ResearchAssistants();
		int index = super.ind;// access an argument from the super class
		res1.sevrpaycal(index);
		res1.benefits(105);//105 for research assistants
		super.totalSalary = super.baseSalary + res1.getben() + res1.getpay();
		txtarray[index][4] = String.valueOf(totalSalary);/*you can change with identity numbers because one more identity numbers
		in array*/
	}
}
