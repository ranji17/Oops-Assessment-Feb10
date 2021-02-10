package OopsAssessment;

public class Employee {

	private String firstName;
	private String lastName;


	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public static void main(String[]args) {
		Employee e1 = new Employee("Rahul","Dravid");
		Employee e2 = new Employee("Virat","Kohli");
		Employee e3 = new Employee("MahendraSingh","Dhoni");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}
}


