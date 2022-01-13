public class Contact implements Comparable<Contact>{
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	Contact(String phone, String first, String last,String security){ 
	    this.socialSecurityNumber = security; 
	    this.firstName = first; 
	    this.lastName = last; 
	    this.phoneNumber = phone;
	} 
	
	
	public String getsocialSecurityNumber() { 
		return socialSecurityNumber; 
	}
	public void setsocialSecurityNumber(String security) { 
		this.socialSecurityNumber = security; 
	}
	
	
	public String getFirstName() { 
		return firstName; 
	}
	public void setFirstName(String first) { 
	    this.firstName = first; 
	}
	
	
	public String getlastName() { 
	    return lastName; 
	}
	public void setlastName(String last) { 
	    this.lastName = last; 
	}
	
	
	public String getphoneNumber() { 
	    return phoneNumber; 
	}
	public void setphoneNumber(String phone) { 
	    this.phoneNumber = phone; 
	} 
	
	
	public int compareTo(Contact o) {// compare to with phone number
		return this.phoneNumber.compareTo(o.phoneNumber);   
	}
	public int hashCode(){
        return phoneNumber.hashCode();
    }
	
	public boolean equals(Object obj) {// remove same phone number
		if (obj instanceof Contact) {
			Contact pp = (Contact) obj;
            return (pp.phoneNumber.equals(this.phoneNumber));
        } else {
            return false;
        }
    }

}
