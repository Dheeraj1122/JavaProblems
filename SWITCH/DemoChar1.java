class DemoChar1
{
   public static void main(String args[])throws Exception
   {
   System.out.println("Enter any Character");
   System.out.println("a:airline reservation,b:bus reservation,t:train reservation");
    int i=System.in.read();
	System.out.println("your input is:"+(char)i);
	switch(i)
	{
	case 'a':
	case 'A':
	System.out.println("Welcome to airline reservation system");
	break;
	case 'b':
	case 'B':
	System.out.println("Welcome to bus reservation system");
	break;
	case 't':
	case 'T':
	System.out.println("Welcome to railway reservation system");
	break;
	default :
	System.out.println("WRONG ENTRY");
	break;
	}
	}
}
