package control_state;

public class NestedIfElse_Study {

	public static void main(String[] args) 
	{
		String UN="Velocity";
		int PWD=1234;
		
		if (UN=="Velocity")
		{
			System.out.println("Valid username. please enter password");
			if (PWD==1234)
			{
				System.out.println("Valid password. Login Successfully");
			}
			else
			{
				System.out.println("in valid PWD login fail");
			}
			
		}
		else 
		{
			System.out.println("in valid username");
			
		}
		

	}

}
