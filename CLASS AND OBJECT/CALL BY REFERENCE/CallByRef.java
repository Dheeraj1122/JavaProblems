class Demo
{
 int a=10;
 int b=20;
 Demo()
 {
  System.out.println("Object created!!");
 }
}
class A
{
 A(Demo d1)
 {
  System.out.println("address of d1 is:"+d1);
  System.out.println(d1.a+d1.b);
  d1.a=5;
  d1.b=10;
 }
}
class B
{
 B(Demo d2)
 {
 System.out.println("address of d2 is:"+d2);
 System.out.println(d2.a*d2.b); 
 }
}
class CallByRef
{
public static void main(String args[])
{
 Demo obj=new Demo();
 A oa=new A(obj);
 B ob=new B(obj);
}
}