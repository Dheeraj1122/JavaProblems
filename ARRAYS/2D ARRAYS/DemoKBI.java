import java.util.Scanner;
class DemoKBI
{
   public static void main(String args[])
   {
    Scanner sc= new Scanner(System.in);
	//System.in is input from keyboard
	System.out.print("Enter first number:"+" ");
	int i=sc.nextInt();
	System.out.print("Enter second number:"+" ");
	int j=sc.nextInt();
	System.out.println("sum is:"+(i+j));
	sc.close();
	}
}