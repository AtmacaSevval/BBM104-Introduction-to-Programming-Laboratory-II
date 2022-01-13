public class Academician extends Personel {
	protected int ssBenefits;
	protected void benefits(int x) {// ssbenefits for faculty members and research assistants 
		int i = baseSalary * x / 100;
		setben(i);// set ssBenefits
	}
	
	protected void setben(int i) {
		this.ssBenefits = i; 
	}
	
	protected int getben() {// get ssBenefits
		return ssBenefits;
	}
	
	public void callFaculty() {//Call FacultyMember class
		Academician faculty2 = new FacultyMember(); 
		((FacultyMember) faculty2).salaryfac();
	}
	
	public void callReser() {//Call ResearchAssistants
		Academician res2 = new ResearchAssistants(); 
		((ResearchAssistants) res2).salaryres();
	}
}	

