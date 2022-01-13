import java.io.IOException;

public class Main{
	public static String arg0;
	public static String arg1;
	public static void main(String[]args) throws IOException {
		arg0 =args[0];
		arg1 =args[1];
		ReadFiles read1 = new ReadFiles();
		read1.main(null);// two arrays for two txt files
		Personel person1 =new Personel();
		person1.arraymet();	
		Writefile write1 = new Writefile();
		for(int i=0;i<person1.txtarray.length;i++){// a class to create a txt file for each line in txt file
			write1.write(person1.txtarray[i][1]+ ".txt", i);
		}
	}
}