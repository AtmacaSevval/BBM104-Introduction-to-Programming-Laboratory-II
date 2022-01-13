public class Measuring extends Decorator{
	Patients pat; 
	public Measuring(Patients pat) { this.pat = pat; }  
	public int cost() { return 5  + pat.cost(); }// add 5$ and call after next user

}
