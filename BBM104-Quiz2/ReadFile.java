import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class ReadFile {
	public static ArrayList<String> list1=new ArrayList<String>();//To add each line in  file I create an arraylist.
	public static String[][] arr1;//arr 1 is multi dimensional to access easily
	public static String[] readFile(String path){
		try {
		int i = 0;
		int length = Files.readAllLines(Paths.get(path)).size();
		String[] results =  new String[length];
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[i++] = line;
			}
		return results;
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	public ArrayList<String> getList() {
	       return list1;
	}
	public static void write (String filename, String[][] x) throws IOException{//array for each sports
		  BufferedWriter outputWriter = null;
		  outputWriter = new BufferedWriter(new FileWriter(filename));
		  for (int i = 0; i < x.length; i++) {
			  outputWriter.write(i + 1 + "." +"\t");
			  for (int j = 0; j < x[i].length; j++) {
				  outputWriter.write(x[i][j]);
				  if(j == 5) {
					outputWriter.write(":");// there is : between index 5 and index 6
				  }else{
			  		outputWriter.write("\t");			  		  
			  	  }
			  }
			  outputWriter.newLine();
		  }
		  outputWriter.flush();  
		  outputWriter.close();  
	}
	
	public static void main(String[] args) {
		Main main1 = new Main();
		String[] lines = readFile(main1.arg1);//Calling arg[0]
		for (String line : lines) {
			list1.add(line);//added each line txt file.
		}
		ReadFile sports2 = new ReadFile();
		ArrayList<String> newlist1 = sports2.getList();
		String[] array1 = newlist1.toArray(new String[0]);//Arraylist convert to array
		int num1 = array1.length;
		String[][] array2 = new String[num1][];
		for(int i = 0;i<array1.length; i++) {// each attribute add a arr1 to access easily.
			String word = (String) array1[i];
			String[] splitWord1 = new String[num1];
			splitWord1 = word.split("\t");
			array2[i]=new String[splitWord1.length];
			for(int i1 = 0;i1<splitWord1.length;i1++) {
				array2[i][i1]=(String) splitWord1[i1];
			}
		}
		arr1  = array2;
	}
}
