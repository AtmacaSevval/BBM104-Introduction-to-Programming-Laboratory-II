import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
public class Sports {
	protected char c;
	protected String[][] arr2 = new String[ReadFile.arr1.length / 4][]; //volleyball array
	protected String[][] arr3 = new String[ReadFile.arr1.length / 4][]; //handball array
	protected String[][] arr4 = new String[ReadFile.arr1.length / 4][]; //basketball array
	protected String[][] arr5 = new String[ReadFile.arr1.length / 4][]; //icehokey array
	void sortbyavalue(String[][] arr) {
		Arrays.sort(arr, new Comparator<String[]>(){
			public int compare(String[] o1, String[] o2) {
				Integer itemIdOne = Integer.parseInt(o1[7]);
				Integer itemIdTwo = Integer.parseInt(o2[7]);
				if(itemIdOne.compareTo(itemIdTwo)==0){// if they are equals ,they are compared bynumber of scores
					Integer itemIdOnee = Integer.parseInt(o1[5]);
					Integer itemIdTwoo = Integer.parseInt(o2[5]);
					Integer itemIdOne1 = Integer.parseInt(o1[6]);
					Integer itemIdTwo2 = Integer.parseInt(o2[6]);
					Integer i1 = itemIdOnee-itemIdOne1;
					Integer i2 = itemIdTwoo-itemIdTwo2;
					return -i1.compareTo(i2);}
				else {
					return -itemIdOne.compareTo(itemIdTwo); }// compare last index if it is bigger than other return mines
			}
		});
	}

	
	void toseperatearr(char c ,String[][] arr2) {// to seperation arrays by letters
		int o = 0;
		for(int t = 0;t<ReadFile.arr1.length;t++) {
			char s = ReadFile.arr1[t][0].charAt(0);
			if(s == c){
				arr2[o] = ReadFile.arr1[t];
				o += 1;
			}
		}	
	}
	void teams(String[] arrx,String[][] arry){//to make team names unique
		for(int k = 0;k<arrx.length/2;k++) {
			arrx[k] =  arry[k][1];	
		}
		int z = 0;
		for(int u = arrx.length / 2 ;u <arrx.length;u++) {
			arrx[u] = arry[z][2];
			z += 1;
		}
	}
	
	void dub(String[] arrx,String[][] arrx1) {// to remove dublicates value in an array
		Set<String> stringSet = new HashSet<>(Arrays.asList(arrx));
		String[] dub1 = stringSet.toArray(new String[0]);
		for(int i = 0;i<arrx1.length;i++) {
			arrx1[i][0]=dub1[i];
		}
	}
	void numberofmatches(String[][] arrx,String[][] arry) {
		for(int i=0;i<arrx.length;i++){
			int matchnum = 0;int winnum = 0;int lossnum = 0;int evennum = 0;int ownscore= 0;int opposcore = 0;
			for(int j = 0; j<arry.length;j++) {
				if(arrx[i][0].equals(arry[j][1]) || arrx[i][0].equals(arry[j][2])){
					matchnum += 1;
					if(arrx[i][0].equals(arry[j][1])) {/*if arrx[i][0] equals to arry[j][1] taken before
						two dots to calculate score and match status*/
						String s1 = arry[j][3];
						String s2 =	s1.split(":")[0];// to add seperate by :
						String s3 = s1.split(":")[1];
						int i1=Integer.parseInt(s2);//own score 
						int i2=Integer.parseInt(s3);//opponent score
						ownscore += i1;
						opposcore += i2;
						if(i1 > i2) {// winning 
							winnum += 1;}
						else if(i2 > i1) {//losing
							lossnum +=1;}
						else if(i2 == i1) {//draw
							evennum += 1;}
					}
					if(arrx[i][0].equals(arry[j][2])) {
						String z1 = arry[j][3];
						String z2 = z1.split(":")[0];
						String z3 = z1.split(":")[1];
						int k1=Integer.parseInt(z2); 
						int k2=Integer.parseInt(z3);
						ownscore += k2;
						opposcore += k1;
						if(k1 > k2) {//losing
							lossnum += 1;}
						else if(k2 > k1) {// winning 
							winnum +=1;}
						else if(k2 == k1) {//draw
							evennum +=1;}
					}
				}
			}
			arrx[i][1] = Integer.toString(matchnum);
			arrx[i][2] = Integer.toString(winnum);
			arrx[i][3] = Integer.toString(evennum);
			arrx[i][4] = Integer.toString(lossnum);
			arrx[i][5] = Integer.toString(ownscore);
			arrx[i][6] = Integer.toString(opposcore);
		}		
	}
	//to drawn score for ice hokey and handball
	void scores(String[][] arrx){
		for(int i=0;i<arrx.length;i++){
			int num1 =Integer.parseInt(arrx[i][3]); //To add values convert to string to int
			arrx[i][7] = arrx[i][7] == null? "0":arrx[i][7];
			int arrayint = Integer.parseInt(arrx[i][7]);
			arrx[i][7] = Integer.toString(num1 + arrayint);
		}
	}
	//to win score for handball and basketball //win
	void scores2(String[][]arrx) {
		for(int i=0;i<arrx.length;i++){
			int num2 =Integer.parseInt(arrx[i][2]); //To add values convert to string to int
			arrx[i][7] = arrx[i][7] == null? "0":arrx[i][7];
			int arrayint1 = Integer.parseInt(arrx[i][7]);
			arrx[i][7] = Integer.toString(num2 * 2 + arrayint1);// two points
		}
    }	
}



