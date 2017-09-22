class Meth
{
  void calc(int a,int b)
  {
  System.out.println("int,int called");
  }
  void calc(float a,double b)
  {
  System.out.println("float,double called");
  }
  void calc(double a)
  {
  System.out.println("double called");
  }
}
class UseMeth1
{
public static void main(String args[])
{
  Meth m=new Meth();
  m.calc(4,4);
  m.calc(4);
  m.calc(4.4f,3);
  m.calc(3.4f,5.4);
  m.calc(2.2);
 }
}