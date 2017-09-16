import java.util.Scanner;
class DemoArmstrong
{
 public static void main(String args[])
 {
    int result=0,rem,num;
    
    Scanner sc=new Scanner(System.in);
	System.out.println("enter a three digit number");
    num=sc.nextInt();
 
         while(num != 0)
		{
            rem=num%10;
            result=result+(rem*rem*rem);
	        num=num/10;
		}
     if(result==num)
	 System.out.println("this is a armstrong number");
	 else
	 System.out.println("not a armstrong number");
 }
}