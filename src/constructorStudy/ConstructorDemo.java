package constructorStudy;

public class ConstructorDemo {
	
	int a;
	int b;
	
	
	public ConstructorDemo()
	{
		a=10;
		b=20;
		
	}
	
	public ConstructorDemo(int x,int y)
	{
		a=x;
		b=y;
	}
	
	public void add()
	{
		int sum=a+b;
		System.out.println("sum = "+sum);
	}
	
	public void sub()
	{
		int sub=a-b;
		System.out.println("sub = "+sub);
	}

	public static void main(String[] args) 
	{
		ConstructorDemo cd=new ConstructorDemo();
		cd.add();
		cd.sub();
		
		ConstructorDemo cd1=new ConstructorDemo(1, 2);
		cd1.add();
		cd1.sub();

	}

}
