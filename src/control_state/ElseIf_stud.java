package control_state;

public class ElseIf_stud {

	public static void main(String[] args) 
	{
		//if good morning <12pm(1:00)
		//12pm(12:00) to 5pm(17:00)=Good afternoon
		//5pm(17:00) to 12am(24)=good night
		
		int time=16;
		
		if(time<=12)
		{
			System.out.println("Good Morning");
		}
		else if(time<=17)
		{
			System.out.println("Good afternoon");
		}
		else if(24>=time)
		{
			System.out.println("Good night");
		}
		else
		{
			System.out.println("enter correct time");
		}

	}

}
