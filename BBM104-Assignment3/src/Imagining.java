public class Imagining extends Decorator{
	Patients pat; 
	public Imagining(Patients pat) { this.pat = pat; }  
	public int cost() { return 10 + pat.cost(); }// add 10$ and call after next user
}
