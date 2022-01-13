public class Security extends Personel{
	private int transMoney;
	private int foodMoney;
	private int hourOfWork;
	private void hourOfWork(int i) {
		Personel per1 = new Personel();
		per1.getarr();
		int week1 = Integer.parseInt(per1.getarr()[i][5]);int week2 = Integer.parseInt(per1.getarr()[i][6]);int week3 = Integer.parseInt(per1.getarr()[i][7]);int week4 = Integer.parseInt(per1.getarr()[i][8]);
		if(week1 >= 30 && week1<= 54 ){//minimum 30 hours
			hourOfWork += week1 *10;transMoney += 30;foodMoney += 60;}// 5 Tl/ per days for trans money
		
		else if(week1 > 54) {
			hourOfWork += 54 * 10;transMoney += 30;foodMoney += 60;}// 10 Tl/ per days for food money
		
		else{
			hourOfWork += 0;}//// if more than 54 hours even though we calculate not more than 54 hours
		
		if(week2 >= 30 && week2<= 54 ){
			hourOfWork += week2 *10;transMoney += 30;foodMoney += 60;}
		
		else if(week2 > 54) {
			hourOfWork += 54 * 10;transMoney += 30;foodMoney += 60;}
		
		else{
			hourOfWork += 0;}
		
		if(week3 >= 30 && week3<= 54 ){
			hourOfWork += week3 *10;transMoney += 30;foodMoney += 60;}
		
		else if(week3 > 54) {
			hourOfWork += 54 * 10;transMoney += 30;foodMoney += 60;}
		
		else{
			hourOfWork += 0;}
		
		if(week4 >= 30 && week4<= 54 ){
			hourOfWork += week4 *10;transMoney += 30;foodMoney += 60;}
		
		else if(week4 > 54) {
			hourOfWork += 54 * 10;transMoney += 30;foodMoney += 60;}
		
		else{
			hourOfWork += 0;}	
	}
	 
	public void salarysec() {
		Security sec2 = new Security();
		int index = super.ind;// get super index
		sec2.sevrpaycal(index);//severance pay
		hourOfWork(index);
		super.totalSalary = sec2.getpay() + hourOfWork + foodMoney + transMoney ;
		txtarray[index][4] = String.valueOf(totalSalary);
	}
}
