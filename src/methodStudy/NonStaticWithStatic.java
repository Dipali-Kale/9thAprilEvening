package methodStudy;

public class NonStaticWithStatic {

	public static void main(String[] args) 
	{
		StaticWithNonStatic.empl();//another class
		StaticWithNonStatic s=new StaticWithNonStatic();
		s.comp();//another class
		emp1();//same class
		NonStaticWithStatic n=new NonStaticWithStatic();
		n.emp2();//same class
	}
		

		//Static method
	public static void emp1()
	{
		String name="Pooja Panchal";
		String city="Aurangabad";
		int sal=42000;
		int age=24;
		byte sector=120;
		System.out.println("Employee name is "+name);
		System.out.println("Current Location "+city);
		System.out.println("Salary "+sal);
		System.out.println("Age "+age);
		System.out.println("Sector "+sector);
		System.out.println("*************");
	}
	//non Static Mehtod
	public void emp2()
	{
		String name="Ananya Panchal";
		String city="Aurangabad";
		int sal=40000;
		int age=22;
		byte sector=100;
		System.out.println("Employee name is "+name);
		System.out.println("Current Location "+city);
		System.out.println("Salary "+sal);
		System.out.println("Age "+age);
		System.out.println("Sector "+sector);
		System.out.println("*************");
	
		
	}
		

}
