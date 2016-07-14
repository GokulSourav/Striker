import java.util.Scanner;


public class prime {
public static void main(String[] args) {
	int x=0,i;
	Scanner s=new Scanner(System.in);
	x=s.nextInt();
	for(i=2;i<x;i++)
		
	{
		if(x%i==0)
			
		{
			System.out.println("The Number is not prime");
			break;
		}
	}
	if(i==x)
	{
		System.out.println("The number is prime");
	}
}

}
