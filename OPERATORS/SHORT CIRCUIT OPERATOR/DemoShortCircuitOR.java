class DemoShortCircuitOR
{
	public static void main(String args[])
	 {
	  int a=10;
	  int b=20;
	    if((a>b)||(a=20)==a)
		{
		  System.out.println("we are in if block");
		  }
		  System.out.println("now value of a is"+a);
	  }
}