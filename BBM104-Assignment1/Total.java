import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Total {
	public static float number1;
	public static float number2;
	public static float total;
	public static void main(String[] args) {
		ShoppingList shop3 = new ShoppingList();
		PriceList price3 = new PriceList();
		for(int l = 0; l<shop3.arr1.length;l++) {
			System.out.println("---"+ shop3.arr1[l][0]+ "---");
			total = 0;// every loop total must vanish
			String pattern = "dd.MM.yyyy";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
	        LocalDate d1 = LocalDate.parse(shop3.arr1[l][2], formatter);//user date
	        
			for(int j = 3;j<shop3.arr1[l].length;j+=2) {//for each user I used for loop.
				for(int h = 0; h<price3.arr2.length; h++) {//I search accurate membership for this.I search according to pricelist array
			        
					LocalDate d2 = LocalDate.parse(price3.arr2[h][2], formatter);//starting date
			        LocalDate d3 = LocalDate.parse(price3.arr2[h][3], formatter);//finishing date
			        
					if (price3.arr2[h][0].equals(shop3.arr1[l][j]) && shop3.arr1[l][1].equals(price3.arr2[h][1]) && d3.compareTo(d1) >= 0 && d2.compareTo(d1) <=0 ){
						// I am using compareTo to compare dates
						float number1 = Float.parseFloat(price3.arr2[h][4]);
						float number2 = Float.parseFloat(shop3.arr1[l][j+1]);
						total+=number1*number2;//cloth * number of cloth
						System.out.print(shop3.arr1[l][j]+ "\t" +price3.arr2[h][4] + "\t" + shop3.arr1[l][j+1]+"\t");
						System.out.format("%.1f", (number1*number2));
						System.out.println("");
					}
				}
			}
			System.out.format("Total"+"\t"+"%.1f",total);
			System.out.println("");
		}
	}
}