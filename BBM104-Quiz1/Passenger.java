import java.util.Scanner;
public class Passenger {
	static String name;
	static String surname;
	static char gender;
	Passenger(String name1, String surname1, char gender1){
		name = name1;
		surname = surname1;
		gender = gender1; 
	}
	
	public static String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public static String getsurname(){
		return surname;
	}
	
	public void setsurname(String surname){
		this.surname = surname;
	}
	
	
	public static char getgender(){
		return gender;
	}
	
	public void setgender(char gender){
		this.gender = gender;
	}
	public static void book1() {
		Scanner sc5 = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc5.nextLine();
		System.out.print("Enter surname: ");
		String surname = sc5.nextLine();
		Scanner sc6 = new Scanner(System.in);
		System.out.print("Enter gender: ");
		char gender = sc6.next().charAt(0);
		Passenger sc7 = new Passenger(name, surname, gender);
		sc7.setname(name);
		sc7.setsurname(surname);
		sc7.setgender(gender);
		
	}
	
	public static void display(){
		String name2 = Passenger.getname();
		String surname2 = Passenger.getsurname();
		char gender2 = Passenger.getgender();
		System.out.println(name2 + " " + surname2 + " (" + gender2 + ")");
		Phone.display();
		
	}	

}
