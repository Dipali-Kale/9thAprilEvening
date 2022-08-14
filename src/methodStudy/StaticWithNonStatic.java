package methodStudy;

public class StaticWithNonStatic {

	public static void main(String[] args) 
	{
		empl();//calling static method from same class
		StaticWithNonStatic sn=new StaticWithNonStatic();//object creation of non static method from same class
		sn.comp();//calling non static method using object from same class
		NonStaticWithStatic.emp1();//calling static method from another class
		NonStaticWithStatic ns=new NonStaticWithStatic();//object creation of non static method from another class
		ns.emp2();//calling non static method from another class
	}
    //static method
	public static void empl()
	{
		String emp="Shruti Kshirsagar";
		int empid=234;
		String company="TCS";
		System.out.println("Emplyoee Name is "+emp);
		System.out.println("Employee ID is "+empid);
		System.out.println("Company "+company);
		System.out.println("**************");
	}
	//non static method
	public void comp()
	{
	    String compn="TATA consultacy services" ;
	    String loc="Pune";
	    int employee=400000;
	    char sec='A';
	    System.out.println("Company name "+compn);
	    System.out.println("Location "+loc);
	    System.out.println("Total Employee "+employee);
	    System.out.println("Sector "+sec);
	    System.out.println("*************");
	}
}
