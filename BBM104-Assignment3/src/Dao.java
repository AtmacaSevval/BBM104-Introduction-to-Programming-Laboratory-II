import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface Dao {
	public ArrayList<String> getAll();
	public void add(int i) throws IOException;// to add patient in admission and patient text file
	void deleteById(int i) throws IOException;// to remove patient in admission and patient text file
}
