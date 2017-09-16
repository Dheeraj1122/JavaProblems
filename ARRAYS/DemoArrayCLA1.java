//program to get sum of 10 integers;
class DemoArrayCLA1
{
   public static void main(String args[])
   {
   int len=args.length;
    if(len==0)
	System.out.println("No command line passed");
	else
	{
	  int sum=0;
	 System.out.println("command line values are passed and:");
     for(int i=0;i<len;i++)
   {
     sum=sum+(int)(args[i]);
	} 
	System.out.println("sum  is:  "+sum);
   }
    }
}