package try1;

public class Client {
	public static void main(String args[]) {
		Employee aditi= new Employee(12,"Aditi",4000);
		System.out.println("Initials vacation days: "+aditi.getVacationDays());
		aditi.applyForLeave(5);
		System.out.println("After applying for leave,vacations left: "+aditi.getVacationDays());
		aditi.applyForLeave(5);
		System.out.println("After applying for leave,vacations left: "+aditi.getVacationDays());
	}
}
