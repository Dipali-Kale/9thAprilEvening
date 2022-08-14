package control_state;

public class ElseIf_Study {

	public static void main(String[] args) 
	{
		//if marks >=95 then I got distinction
		//if marks is >=85 and <95 then I got A+ grade
		//if marks is >=75 and <85 then I got A grade
		//if marks is >=65 and <75 then I got B grade
		//if marks is >=55 and <65 then I got C grade
		//if marks is >=45 and <55 then I am pass
		//if marks is >=35 then Fail
		
		
		int marks=9;
		if (marks>95)
		{
			System.out.println("I got distinction");
		}
		else if (marks>=85 & marks<95) 
		{
			System.out.println("I got A+ grade");
			
		}
		else if (marks>=75 & marks<85) 
		{
			System.out.println("I got A grade");
			
		}
		else if (marks>=65 & marks<75) 
		{
			System.out.println("I got B grade");
			
		}
		else if (marks >=55 & marks<65) 
		{
			System.out.println("I got C grade");
			
		}
		else if (marks>=45 & marks<55) 
		{
			System.out.println("I am PASS");
			
		}
		else 
		{
			System.out.println("FAIL");
			
		}
		
	}

}
