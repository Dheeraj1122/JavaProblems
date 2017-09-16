class DemoConditional1
{
   public static void main(String args[])
   {
    int a=(int)(Math.random()*100);
	int b=(int)(Math.random()*100);
	System.out.println("a is:"+a);
	System.out.println("b is:"+b);
	int result=(a>b)?a:b;
	System.out.println("Greater no. is:"+result);
	}
}