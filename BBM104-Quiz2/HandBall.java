class HandBall extends Sports{
	public String[] arrh  = new String[arr3.length*2];
	public String[][] arrh1  = new String[(int) (Math.sqrt(arrh.length + 0.25) +0.5)][8];
	public void display(){
		HandBall hand1 = new HandBall();
		hand1.toseperatearr('H', arr3);
		hand1.teams(arrh, arr3);// to seperate teams
		hand1.dub(arrh , arrh1);
		hand1.numberofmatches(arrh1, arr3);//number of matches
		super.scores(arrh1);
		super.scores2(arrh1);
		hand1.sortbyavalue(arrh1);	// sort values by a column
	}
}
