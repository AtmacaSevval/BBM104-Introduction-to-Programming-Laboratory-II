public class DoctorVisit extends Decorator{
	Patients pat; 
	public DoctorVisit(Patients pat) { this.pat = pat; }  
	public int cost() { return 15 + pat.cost(); }// add 15$ and call after next user
	
}
