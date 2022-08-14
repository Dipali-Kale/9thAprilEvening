package cons;

public class HR_details {
	
	
    //non static global variable initialisation in main method using object 
	public static void main(String[] args) 
	{
	   Employee_detail Dipali=new Employee_detail();
	   Dipali.emp_name="Dipali Kale";
	   Dipali.emp_id="DK3764";
	   Dipali.emp_sal=80000;
	   Dipali.emp_desg="Automation Engineer";
	   Dipali.emp_age=29;
	   Dipali.emp_gender='F';
	   
	   Dipali.emp_info();
	   
	   Employee_detail Sarika=new Employee_detail();
	   Sarika.emp_name="Sarika Sapkal";
	   Sarika.emp_id="SS3456";
	   Sarika.emp_sal=85000;
	   Sarika.emp_desg="Quality Assurance";
	   Sarika.emp_age=28;
	   Sarika.emp_gender='F';
	   
	   Sarika.emp_info();
	   
	   Employee_detail Vaishali=new  Employee_detail();
	   Vaishali.emp_name="Vaishali Sonavane";
	   Vaishali.emp_id="VS3378";
	   Vaishali.emp_sal=78000;
	   Vaishali.emp_desg="Test Emgineer";
	   Vaishali.emp_age=28;
	   Vaishali.emp_gender='F';
	   
	   Vaishali.emp_info();
	   
	  
	   
	   
	   
	   
	   
	   
			   

	}

}
