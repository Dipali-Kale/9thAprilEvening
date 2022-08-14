package cons;

public class Employee_detail {
	
	//Variable declaration
	String emp_name;
	String emp_id;
	float emp_sal;
	String emp_desg;
	int emp_age;
	char emp_gender;
	static String team;
	
	
	
	//usage of variable in non static method
	public void emp_info()
	{
		System.out.println("======================");
		System.out.println("Employee Name is "+emp_name);
		System.out.println("Employee id is "+emp_id);
		System.out.println("Employee salary is "+emp_sal);
		System.out.println("Employee designation is "+emp_desg);
		System.out.println("Employee age is "+emp_age);
		System.out.println("Employee gender is "+emp_gender);
		System.out.println("=========================");
	}

		}

