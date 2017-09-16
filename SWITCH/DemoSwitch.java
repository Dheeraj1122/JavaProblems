class DemoSwitch
{
   public static void main(String args[])
   {
    int i=(int)(Math.random()*5);
	System.out.println(i);
	switch(i)
	{
	 case 1:
	 System.out.println("ONE");
	 break;
	 case 2:
	 System.out.println("TWO");
	 break;
	 case 3:
	 System.out.println("THREE");
	 break;
	 case 4:
	 System.out.println("FOUR");
	 break;
	 case 5:
	 System.out.println("FIVE");
	 break;
	 default:
	 System.out.println("Wrong entry");
	 break;
	 }
	 System.out.println("END OF PROGRAM");
	}
}