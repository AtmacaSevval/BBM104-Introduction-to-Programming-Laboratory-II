import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Bus {
	public static int[] arr = IntStream.range(1, 43).toArray();
	String plate;
	int seatCount;

	Bus(String plate1, int SeatCount1){
		plate = plate1;
		seatCount = SeatCount1;
	}

	
	public String getplate(){
		return plate;
	}
	
	public void setstatus(String plate){
		this.plate = plate;
	}

	
	public int getSeatCount(){
		return seatCount;
	}
	
	public void setSeatCount(int seatCount){
		this.seatCount = seatCount;
	}
			
	public void bookSeat(){		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter seat id:");
		int SeatID4 = sc3.nextInt();
		Passenger.book1();
		Phone.book2();
		Seat sc4 = new Seat(SeatID4,true);
		sc4.setSeatID(SeatID4);
		sc4.setstatus(true);
		int SeatID2 = Seat.getSeatID();
		boolean status2 = Seat.getstatus();	
		
		boolean contains = IntStream.of(arr).anyMatch(x -> x == SeatID2);
		if(contains == false){
			System.out.println("The seat has already reserved!");
			main(null);}
		
	
		
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == SeatID2){
                for(int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        int[] t = Arrays.copyOf(arr, arr.length );
        int[] arr = Arrays.copyOf(t, t.length - 1);
	}

	public void printAllAvailableSeatIDs(){
		System.out.print("Available: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
	
	public void printAllPassengers() {
		Seat.display();
	}
	
	public void search() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc1.nextLine();
		System.out.print("Enter surname: ");
		String surname = sc1.nextLine();
		Passenger.display();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
