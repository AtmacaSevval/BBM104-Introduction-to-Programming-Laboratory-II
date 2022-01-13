import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PriceList {
	static ArrayList<String> list2=new ArrayList<String>();//To add each line in PriceList file I create an arraylist.
	public static String[][] arr2;//arr 2 is multi dimensional to access easily
	public static String[] readFile(String path){
		try {
		int i1 = 0;
		int length1 = Files.readAllLines(Paths.get(path)).size();
		String[] results1 =  new String[length1];
			for (String line1 : Files.readAllLines(Paths.get(path))) {
				results1[i1++] = line1;
			}
		return results1;
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	public ArrayList<String> getList1() {
	       return list2;
	}
	
	public void main(String[] args) {
		Main main1 = new Main();
		String[] lines1 = readFile(main1.getarg4());//Calling arg[1]
		for (String line1 : lines1) {
			list2.add(line1);//added each line PriceList txt file.
		}
		PriceList price2 = new PriceList();
		ArrayList<String> newlist2 = price2.getList1();
		String[] array3 = newlist2.toArray(new String[0]);//Arraylist convert to array
        int num2 = array3.length;
		String[][] array4 = new String[num2][];
		for(int i = 0;i<array3.length; i++) {// each attribute add a arr1 to access easily.
			String word1 = (String) array3[i];
			String[] splitWord2 = new String[num2];
			splitWord2 = word1.split("\t");
			array4[i]=new String[splitWord2.length];
			for(int i1 = 0;i1<splitWord2.length;i1++) {
				array4[i][i1]=(String) splitWord2[i1];
			}
		}
		arr2 = array4;// arr2 is equaled to access from other class
	}
}
