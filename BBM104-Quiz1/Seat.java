public class Seat {
	public static int SeatID;
	static boolean status;
	Seat(int SeatID1, boolean status){
		SeatID = SeatID1;
		status = true;
		
	}
	
	public static int getSeatID(){
		return SeatID;
	}
	
	public void setSeatID(int SeatID){
		this.SeatID = SeatID;
	}
	
	public static boolean getstatus(){
		return status;
	}
	
	public void setstatus(boolean status){
		this.status = status;
	}
	
	public static void display(){
		int SeatID2 = Seat.getSeatID();
		boolean status2 = Seat.getstatus();
		System.out.println("Seat: "+ SeatID2  + " Status: " + "Reserved");
		Passenger.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
