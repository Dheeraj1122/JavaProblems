class DemoSwitch1
{
   public static void main(String args[])
   {
    int i=(int)((Math.random()*12)+1);
	System.out.println(i);
	switch(i)
	{
	 case 1:
	 case 2:
	 case 3:
	 System.out.println("1st Quater");
	 break;
	 case 4:
	 case 5:
	 case 6:
	 System.out.println("2nd Quater");
	 break;
	 case 7:
	 case 8:
	 case 9:
	 System.out.println("3rd Quater");
	 break;
	 case 10:
	 case 11:
	 case 12:
	 System.out.println("4th Quater");
	 break;
	 default:
	 System.out.println("Wrong entry");
	 break;
	 }
	 System.out.println("END OF PROGRAM");
	}
}