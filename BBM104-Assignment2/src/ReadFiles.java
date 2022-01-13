import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFiles {
	public static ArrayList<String> list1=new ArrayList<String>();//To add each line in first file I create an arraylist.
	public static String[][] arr1;//arr 1 is multi dimensional to access easily
	public static ArrayList<String> list2=new ArrayList<String>();//To add each line in second file I create an arraylist.
	public static String[][] arr2;//arr 1 is multi dimensional to access easily

	public static void main(String[] args) {
		Main main =  new Main();
        try (BufferedReader br = new BufferedReader(new FileReader(main.arg0)))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                list1.add(sCurrentLine);//add each line int first txt file
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
        try (BufferedReader br = new BufferedReader(new FileReader(main.arg1)))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                list2.add(sCurrentLine);//add each line int second txt file
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
			splitWord = word.split("\t");
			array2[i]=new String[splitWord.length];
			for(int i1 = 0;i1<splitWord.length;i1++) {
				array2[i][i1]=(String) splitWord[i1];
			}
		}
		arr1  = array2;
		String[] array3 = list2.toArray(new String[0]);//Arraylist convert to array
		int num2 = array3.length;
		String[][] array4 = new String[num2][];
		for(int i = 0;i<array3.length; i++) {// each attribute add a arr1 to access easily.
			String word1 = (String) array3[i];
			String[] splitWord1 = new String[num1];
			splitWord1 = word1.split("\t");
			array4[i]=new String[splitWord1.length];
			for(int i1 = 0;i1<splitWord1.length;i1++) {
				array4[i][i1]=(String) splitWord1[i1];
			}
		}
		arr2  = array4;

    }
}
