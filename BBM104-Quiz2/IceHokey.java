public class IceHokey extends Sports{
	public String[] arrI1  = new String[arr5.length*2];
	public String[][] arrI2  = new String[(int) (Math.sqrt(arrI1.length + 0.25) +0.5)][8];
	public void scores(String[][]arrx) {//to calculate win scores points in basketball
		for(int i=0;i<arrx.length;i++){
			int num1 =Integer.parseInt(arrx[i][2]); 
			arrx[i][7] = arrx[i][7] == null? "0":arrx[i][7];
			int arrayne = Integer.parseInt(arrx[i][7]);
			arrx[i][7] = Integer.toString(num1 * 3 + arrayne);//3 points
		}
	}
	public void display(){
		IceHokey ice1 = new IceHokey();
		ice1.toseperatearr('I', arr5);
		ice1.teams(arrI1, arr5);// to seperate teams
		ice1.dub(arrI1 , arrI2);
		ice1.numberofmatches(arrI2, arr5);//number of matches
		ice1.scores(arrI2);
		super.scores(arrI2);
		ice1.sortbyavalue(arrI2);	// sort values by a column

	}
}


