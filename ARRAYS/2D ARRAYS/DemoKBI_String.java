import java.util.Scanner;
class DemoKBI_String
{
   public static void main(String args[])
   {
    Scanner sc= new Scanner(System.in);
	//System.in is input from keyboard
	System.out.print("Enter first name:"+" ");
	String i=sc.nextLine();
	System.out.print("Enter second name:"+" ");
	String j=sc.nextLine();
	System.out.println("Fullname is:"+(i+" "+j));
	sc.close();
	}
}