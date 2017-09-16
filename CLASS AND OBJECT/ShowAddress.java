class Address 
{
	void ShowInfo()
	{
	  System.out.println("131");
	  System.out.println("Scheme no.2");
	  System.out.println("Lajpaat Nagar");
	  System.out.println("alwar");
	}
	void plus(int a,int b)
	{
	int sum=a+b;
	System.out.println("sum is:"+sum);
	}
}
class ShowAddress
{
   public static void main(String args[])
   {
   Address addr=new Address();
   addr.ShowInfo();
   addr.plus(10,20);
   }
}