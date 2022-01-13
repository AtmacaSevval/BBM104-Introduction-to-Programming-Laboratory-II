import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadInput {
	public static String[][] arr1;//arr 1 is multi dimensional to access easily

	public static void main(String[] args) {
		Main main = new Main();
		ArrayList<String> list1=new ArrayList<String>();//To add each line in first file I create an arraylist.
        try (BufferedReader br = new BufferedReader(new FileReader(main.arg0)))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                list1.add(sCurrentLine);//add each line int first txt file
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
		String[] array1 = list1.toArray(new String[0]);//Arraylist convert to array
		int num1 = array1.length;
		String[][] array2 = new String[num1][];
		for(int i = 0;i<array1.length; i++) {// each attribute add a arr1 to access easily.
			String word = (String) array1[i];
			String[] splitWord = new String[num1];
			splitWord = word.split(" ");
			array2[i]=new String[splitWord.length];
			for(int i1 = 0;i1<splitWord.length;i1++) {
				array2[i][i1]=(String) splitWord[i1];
			}
		}
		arr1  = array2;//arr1 to input files
    }
}
