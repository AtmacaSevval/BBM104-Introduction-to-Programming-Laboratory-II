import java.util.Scanner;
public class Phone {
	static String countrycode;
	static String code;
	static int number;
	static String type;
	public Phone(String countrycode1 , String code1, int number1, String type1){
		countrycode = countrycode1;
		code = code1;
		number = number1;
		type = type1;
	}
	public Phone(String code1, int number1, String type1){
		countrycode = "+90";
		code = code1;
		number = number1;
		type = type1;
	}
	
	public static String gettype(){
		return type;
	}
	
	public void settype(String type){
		this.type=type;
	}
	
	public static String getcountry(){
		return countrycode;
	}
	
	public void setcountry(String countrycode){
		this.countrycode=countrycode;
	}
	
	public static String getcode(){
		return code;
	}
	
	public void setcode(String code){
		this.code=code;
	}
	
	public static int getnumber(){
		return number;
	}
	
	public void setnumber(int number){
		this.number=number;
	}
	public static void book2() {
		Scanner sc8 = new Scanner(System.in);
		System.out.print("Enter countrycode: ");
		String countrycode = sc8.nextLine();
		if (countrycode.trim().isEmpty()) {
			countrycode = "+90";
		}

		System.out.print("Enter code: ");
		String code = sc8.nextLine();
		System.out.print("Enter number: ");
		int number = sc8.nextInt();
		Scanner sc9 = new Scanner(System.in);
		System.out.print("Enter type: ");
		String type  = sc9.nextLine();
		String numbers = Integer.toString(number);
		
		if(numbers.length() != 7) {
			System.out.println("You cannot give a number greater or less than 8 in length");
			main(null);
		}
		
		else if (!(type != "home" || type != "office" || type != "mobile" || type != "MOBÝLE" || type != "HOME" || type != "OFFÝCE")){
			System.out.println("You gave a wrong type");
			main(null);
		}
		Phone sc10 = new Phone(countrycode, code, number, type);
		sc10.setcountry(countrycode);
		sc10.setcode(code);
		sc10.setnumber(number);
		sc10.settype(type);
	}
	
	public static void display(){
		String countrycode2 = Phone.getcountry();
		String code2 = Phone.getcode();
		int number2 = Phone.getnumber();
		String type2  = Phone.gettype();
		System.out.println(type2 + " PHONE:" + code2 + " " + countrycode2 + " " + number2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
