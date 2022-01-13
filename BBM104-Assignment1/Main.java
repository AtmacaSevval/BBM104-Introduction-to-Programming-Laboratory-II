public class Main {
	public static String arg3;
	public static String arg4;
	public String getarg3() {
		return arg3;
	}
	public String getarg4() {
		return arg4;
	}
	public static void main(String[] args) {
		String arg1 = args[0];//first txt file
		String arg2 = args[1];// second txt file
		arg3 = arg1;
		arg4 = arg2;
		ShoppingList shop1 = new ShoppingList();//Calling to read first txt file.
		shop1.main(null);
		PriceList price1 = new PriceList();//Calling to read second txt file.
		price1.main(null);
		Total total1 = new Total();//Calling to calculate total for each costumer.
		total1.main(null);
	}
}
