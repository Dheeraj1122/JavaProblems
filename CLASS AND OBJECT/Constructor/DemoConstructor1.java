class Meth3
 {
  Meth3(int a,int b)
  {
  System.out.println("int , int  called");
  }
  Meth3(double a,double b)
  {
  System.out.println("double , double called");
  }
  Meth3(float a)
  {
  System.out.println("float called");
  }
 }
class DemoConstructor1 
{
   public static void main(String args[])
   {
     Meth3 m=new Meth3(4,4);
	 Meth3 m1=new Meth3(4.4,4.5);
	 Meth3 m2=new Meth3(2.2f);
   }
}  