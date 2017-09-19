class Meth 
{
  int [] show()
  {
   int arr[]={22,23,24,25};
   return arr;
   }
}
class UseMeth
{
  public static void main(String args[])
  {
     Meth m=new Meth();
	 int i[]=m.show();
	 for(int x=0;x<i.length;x++)
	 {
	 System.out.println(i[x]);
	 }
  }
}