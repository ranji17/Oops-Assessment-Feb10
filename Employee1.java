package OopsAssessment;

public class Employee1 {
	private String firstName;
	private String lastName;


	public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	

	@Override
	public String toString() {
		return "Employee1 [firstName=" + firstName + ", lastName=" + lastName + "]";
	}



	public static void main(String[] args) {
		
    try {
    	Employee1 e1= new Employee1("virat",null);
    	
    	System.out.println(e1);
    	
    	
    }
    catch(NullPointerException n) {
    	
    	System.out.println("please enter firstname and lastname properly");
    	
    }
    catch(Exception e) {
    	System.out.println("please enter minimum three characters");
    	
    }
		
	}

}
