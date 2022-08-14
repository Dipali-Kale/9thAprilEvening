//compile time polymorphism 

package compile_time_polymorphism;

public class Overloading 
{
	String name="Shivchhatrapati College";
	String city="Aurangabad";
	int pin=431001;
	String dept="Science";
	String fac="Msc";
	static String HOD="Kiran Patil Sir";


	public static void main(String[] args) 
	{
		Overloading o=new Overloading();
		System.out.println("Head of Department is "+Overloading.HOD);
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		o.teachig_staff();
		o.teaching_staff("Manjiri Lavadkar");
		System.out.println();
		o.teaching_staff(" Ankita Kasliwal ", "AK357");
		System.out.println();
		o.teaching_staff("Ganesh Pathade", " GP347 ", " Jalgaon ");
		System.out.println();
		
		
		
		
	}

	public void teachig_staff()
	{
		System.out.println("This is zero parameter method");
		System.out.println("Details about All teaching staff in CS department");
		System.out.println();
	
	}
	
	public void teaching_staff(String name)
	{
		//name="Manjiri Lavadkar";
		String city="Beed";
		int pin=43210;
		String id="ML123";
		String qul="Msc";
		String fac="I st and II nd year";
		System.out.println("Lecturer Name "+name);
		System.out.println("Belongs from "+ city + pin);
		System.out.println("ID "+id);
		System.out.println("Qualification "+qul);
		System.out.println("Current working place "+this.city + this.pin);
		System.out.println("Teaching at "+this.dept);
		System.out.println("Class "+ fac +"of "+ this.fac);
		System.out.println("--------------------------------");
		System.out.println();
		
	}
	
	public void teaching_staff(String name,String id)
	{
		//name="Ankita Kasliwal";
		//id="AK357";
		String city=" Ajmer ";
		int pin=230012;
		String qul="Msc";
		String fac="I st and II nd year";
		System.out.println("Lecturer Name"+name);
		System.out.println("Belongs from "+ city + pin);
		System.out.println("ID "+id);
		System.out.println("Qualification "+qul);
		System.out.println("Current working place "+this.city + this.pin);
		System.out.println("Teaching at "+this.dept);
		System.out.println("Class "+ fac +"of "+ this.fac);
		System.out.println("------------------------------");
		System.out.println();
		

		
	}
	
	public void teaching_staff(String name,String id,String city)
	{
		//name="Ganesh Pathade";
		//id="GP347";
		//city="Jalgaon";
		int pin=235890;
		String qul="M phill";
		String fac="I st and II nd year";
		System.out.println("Lecturer Name "+name);
		System.out.println("Belongs from "+ city + pin);
		System.out.println("ID "+id);
		System.out.println("Qualification "+qul);
		System.out.println("Current working place "+this.city + this.pin);
		System.out.println("Teaching at "+this.dept);
		System.out.println("Class "+ fac +"of "+ this.fac);
		System.out.println("------------------------------");
		System.out.println();
		
	}
	
	
	
	
	
	
	
	

}
