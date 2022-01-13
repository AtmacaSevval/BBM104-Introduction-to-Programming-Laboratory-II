public class Employee extends Personel{
	protected int hourofwork;
	protected void hourOfWork(int i) {
		Employee emp1 = new Employee();
		emp1.getarr();// get txt1 array
		int week1 = Integer.parseInt(emp1.getarr()[i][5]);int week2 = Integer.parseInt(emp1.getarr()[i][6]);int week3 = Integer.parseInt(emp1.getarr()[i][7]);int week4 = Integer.parseInt(emp1.getarr()[i][8]);
		if(week1 >= 10 && week1<= 20 ){
			hourofwork += week1 *18;}// 18 Tl/ per hours
		
		else if(week1 > 20) {
			hourofwork += 20 * 18;}// if more than 20 hours even though we calculate not more than 20 hours
		
		else{
			hourofwork += 0;}
		
		if(week2 >= 10 && week2<= 20 ){
			hourofwork += week2 * 18;}
		
		else if(week2 > 20) {
			hourofwork += 20 * 18;}
		
		else{
			hourofwork += 0;}
		
		if(week3 >= 10 && week3<= 20 ){
			hourofwork += week3 *18;}
		
		else if(week3 > 20) {
			hourofwork += 20 * 18;}
		
		else{
			hourofwork += 0;}
		
		if(week4 >= 10 && week4 <= 20 ){
			hourofwork += week4 * 18;}
		
		else if(week4 > 20) {
			hourofwork += 20 * 18;}
		
		else{
			hourofwork += 0;}	
	}	
}
