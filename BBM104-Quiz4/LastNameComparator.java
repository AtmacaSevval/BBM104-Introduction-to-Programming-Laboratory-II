import java.util.Comparator;

public class LastNameComparator implements Comparator<Contact>{ // compare last name
	public int compare(Contact a1,Contact a2){   
	     return a1.getlastName().compareTo(a2.getlastName()); 
	  }

}
