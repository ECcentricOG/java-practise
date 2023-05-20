class Employee{

	int empId = 10;
	String name = "Umesh";

	void empInfo(){

		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+name);
	}
}

class MainDemo{

	public static void main(String [] args){

		Employee emp = new Employee();
		
		emp.empInfo();

		System.out.println(emp.empId);
		System.out.println(emp.name);
	}
}
