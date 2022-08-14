//printing table of 2 in reverse format
package Loops;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=20;i>=2; i=i-2)
		{
			System.out.println(i);
		}
		System.out.println();
		int count=1;
		for (int i=2;i<=20;i=i+2)
		{
			System.out.println("2*"+count+"="+i);
			count++;
		}
		

	}

}
