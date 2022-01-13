class Test extends Decorator{
	Patients pat; 
	public Test(Patients pat) { this.pat = pat; }  
	public int cost() { return 7 + pat.cost(); }// add 7$ and call after next user
	
}


