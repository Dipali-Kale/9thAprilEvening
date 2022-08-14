
package compile_time_polymorphism;

public class A extends Overloading 
{

	public static void main(String[] args) 
	{
		A a=new A();
	    a.teachig_staff();
	    a.teaching_staff("ABC");
	    a.teaching_staff("XYZ", "abc", "pqr" );
		

	}

}



//trying to call overloaded method using inheritance concept but only method body execute not global variable executed
//String name="Shivchhatrapati College";
//String city="Aurangabad";
//int pin=431001;
//String dept="Science";
//String fac="Msc";
//static String HOD="Kiran Patil Sir";
//this variable are not executed