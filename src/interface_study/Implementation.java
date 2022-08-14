package interface_study;

public class Implementation implements Interface1
{

	public static void main(String[] args) 
	{
		Implementation i=new Implementation();
		i.demo();
		i.demo(90);
		
		//calling variable in interface by using interface name.variable name
		System.out.println("calling variable in interface "+Interface1.m);
		System.out.println();
		
		i.demo1();//calling its own method
		

	}

	@Override
	public void demo() 
	{
		System.out.println("this is interface class method");
		System.out.println();
	}

	@Override
	public void demo(int a) 
	{
		System.out.println("This is interface class method with parameter");
		System.out.println();
		
	}
	
	public void demo1()
	{
		System.out.println("we can overload methods in interface but parameter are different");
	}

}
