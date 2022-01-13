import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Bus bus = new Bus("06 HUBM 06", 42);
		System.out.println("Menu");
		System.out.println("1-Book a seat");
		System.out.println("2-Display all passengers with their seat numbers");
		System.out.println("3-Display all available seatIDs");
		System.out.println("4-Search");
		System.out.println("5-Exit");
		System.out.print("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1){
			bus.bookSeat();
			main(null);
		}	
		else if(choice==2){
			bus.printAllPassengers();
			main(null);
		}
		else if(choice==3){
			bus.printAllAvailableSeatIDs();
			main(null);
		}
		else if(choice==4){
			bus.search();
			main(null);
		}
		else if(choice==5){
			System.exit(0);
		}
	}
}






