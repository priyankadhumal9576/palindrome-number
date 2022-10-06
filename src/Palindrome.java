import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int rem,sum=0,temp;
		System.out.println("enter the number");
		int num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
			
		
	}

}
