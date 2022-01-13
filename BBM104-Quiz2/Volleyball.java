import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
class Volleyball extends Sports{
	public String[] arrv  = new String[arr2.length*2];
	public String[][] arrv1  = new String[(int) (Math.sqrt(arrv.length + 0.25) +0.5)][8];
	void scores(String[][]arrx , String[][]arry) {
		for(int i=0;i<arrx.length;i++){
			int sc1 = 0;
			for(int j = 0; j<arry.length;j++) {
				if(arrx[i][0].equals(arry[j][1]) || arrx[i][0].equals(arry[j][2])){
					if(arrx[i][0].equals(arry[j][1])) {
						String a1 = arry[j][3];
						String a2 =	a1.split(":")[0];// to add seperate by :
						String a3 = a1.split(":")[1];
						int i1=Integer.parseInt(a2); 
						int i2=Integer.parseInt(a3);
						if(i1 == 3 & (i2 == 0 || i2 == 1)){/*if you have 3 sets and opponent has
							0 or 1 set you earn 3 points*/
							sc1 += 3;}
						else if(i1 ==3 & i2 ==2) {/*if you have 3 sets and opponent has
							2 sets you earn 2 points*/
							sc1 += 2;}
						else if(i1 == 2 & i2 ==3) {/*if you have 2 sets and opponent has
							3 sets you earn 1 points*/
							sc1 += 1;}
						else if((i1 == 0 || i1 ==1) & i2 == 3) {
							/*if you have 0 or 1 set and opponent has
							3 sets you earn 0 point*/
							sc1 += 0;}
					}
					if(arrx[i][0].equals(arry[j][2])) {
						String sa1 = arry[j][3];
						String sa2 = sa1.split(":")[0];
						String sa3 = sa1.split(":")[1];
						int ia1=Integer.parseInt(sa2); 
						int ia2=Integer.parseInt(sa3);
						if(ia2 == 3 & (ia1 == 0 || ia1 == 1)){/*if you have 3 sets and opponent has
							0 or 1 set you earn 3 points*/
							sc1 += 3;}
						else if(ia2 ==3 & ia1 ==2) {/*if you have 3 sets and opponent has
							2 sets you earn 2 points*/
							sc1 += 2;}
						else if(ia2 == 2 & ia1 ==3) {/*if you have 2 sets and opponent has
							3 sets you earn 1 points*/
							sc1 += 1;}
						else if((ia2 == 0 || ia2 ==1) & ia1 == 3) {/*if you have 0 or 1 set and opponent has
							3 sets you earn 0 point*/
							sc1 += 0;}
					}
				}
			}
			arrx[i][7] = Integer.toString(sc1);// add scores
		}
	}
	
	void display() {
		Volleyball user1 = new Volleyball();
		user1.toseperatearr('V', arr2);
		user1.teams(arrv, arr2);// to seperate teams
		user1.dub(arrv , arrv1);
		user1.numberofmatches(arrv1, arr2);//number of matches
		user1.scores(arrv1,arr2);
		user1.sortbyavalue(arrv1);	// sort values by a column

	}
}
