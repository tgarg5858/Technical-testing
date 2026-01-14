package pack1;
enum gender{
	M,F
}
public class person {
	String firstname;
	String secondname;
	gender g;
	Long userid;
	
	
	public person(String fn,String ln,gender gg,long no)
	{
		this.firstname=fn;
		this.secondname=ln;
		this.userid=no;
		this.g=gg;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	

//	public char getGender() {
//		return gender;
//	}
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}

	public static void main(String[] args) {
		
		
		
		
	}

}
