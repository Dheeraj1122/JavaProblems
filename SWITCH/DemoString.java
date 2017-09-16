import java.util.Scanner;
class DemoString

{
   public static void main(String args[])
   {
   System.out.println("Enter any Choice");
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   //System.out.println("a:airline reservation,b:bus reservation,t:train reservation");
    //int i=System.in.read();
	System.out.println("your input is:"+(String)str);
	switch(str.toLowerCase())
	{
	case "airline":
	System.out.println("Welcome to airline reservation system");
	break;
	case "bus":
	System.out.println("Welcome to bus reservation system");
	break;
	case "train":
	System.out.println("Welcome to railway reservation system");
	break;
	default :
	System.out.println("WRONG ENTRY");
	break;
	}
	sc.close();
	}
}
