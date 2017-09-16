class DemoArrayCLA
{
   public static void main(String args[])
   {
   int len=args.length;
    if(len==0)
	System.out.println("No command line passed");
	else
	{
	 System.out.println("command line values are:");
     for(int i=0;i<len;i++)
   {
	System.out.println("args["+i+"]  is:  "+args[i]);
   }
    }
	}
}