import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main{
	public static String arg1;
	public static void main(String[] args) throws IOException{
		String arg =args[0];
		arg1 = arg;
		ReadFile read1 = new ReadFile();
		read1.main(null);
		Volleyball voll1 = new Volleyball();
		voll1.display();
		read1.write("volleyball.txt",voll1.arrv1);
		HandBall hand1 =  new HandBall();
		hand1.display();
		read1.write("handball.txt",hand1.arrh1);
		BasketBall bask1 =  new BasketBall();
		bask1.display();
		read1.write("basketball.txt",bask1.arrb1);
		IceHokey ice1 = new IceHokey();
		ice1.display();
		read1.write("icehokey.txt",ice1.arrI2);
	}
}
