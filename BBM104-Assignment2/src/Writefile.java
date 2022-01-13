import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
	public static void write (String filename, int x) throws IOException{
		  BufferedWriter outputWriter = null;
		  outputWriter = new BufferedWriter(new FileWriter(filename));
		  Personel person1 =new Personel();
		  String u = person1.txtarray[x][0];
		  String name = u.split(" ")[0];
		  String surname = u.split(" ")[1];
		  outputWriter.write("Name "+ ": " + name +"\n");
		  outputWriter.write("Surname "+ ": " + surname +"\n");
		  outputWriter.write("Registration Number "+ ": " + person1.txtarray[x][1] +"\n");
		  outputWriter.write("Position "+ ": " + person1.txtarray[x][2] +"\n");
		  outputWriter.write("Year of Start "+ ": " + person1.txtarray[x][3] +"\n");
		  float tot = Float.parseFloat(person1.txtarray[x][4]);
		  String sf3=String.format("Total Salary : %.2f", tot);
		  sf3.replace(',', '.');
		  outputWriter.write(sf3);
		  outputWriter.write(" TL");
		  outputWriter.flush();  
		  outputWriter.close();  
	}
}