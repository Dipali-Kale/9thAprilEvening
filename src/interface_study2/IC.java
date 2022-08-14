package interface_study2;

public class IC implements A,Interface1
{

	public static void main(String[] args) 
	{
		IC i=new IC();
		i.info();
		

	}

	@Override
	public void info() 
	{
		A.super.info();
		Interface1.super.info();
		
		
	}

	


	
}
