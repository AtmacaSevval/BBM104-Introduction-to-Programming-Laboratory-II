public class BasketBall extends Sports{
	public String[] arrb  = new String[arr4.length*2];
	public String[][] arrb1  = new String[(int) (Math.sqrt(arrb.length + 0.25) +0.5)][8];
	public void scores2(String[][] arrx) {//to calculate lose scores points in basketball
		for(int i=0;i<arrx.length;i++){
			int num1 =Integer.parseInt(arrx[i][4]); 
			arrx[i][7] = arrx[i][7] == null? "0":arrx[i][7];
			int arrayint1 = Integer.parseInt(arrx[i][7]);
			arrx[i][7] = Integer.toString(num1 * 1 + arrayint1);//1 point
		}
	}
	public void display(){
		BasketBall bask1 = new BasketBall();
		bask1.toseperatearr('B', arr4);
		bask1.teams(arrb, arr4);// to seperate teams
		bask1.dub(arrb , arrb1);
		bask1.numberofmatches(arrb1, arr4);//number of matches
		bask1.scores2(arrb1);
		super.scores2(arrb1);
		bask1.sortbyavalue(arrb1);	// sort values by a column
	}
}
