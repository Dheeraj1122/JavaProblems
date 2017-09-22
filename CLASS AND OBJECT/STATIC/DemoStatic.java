class Demo
{
 int a=10;
 static int b=20;
 }
 class DemoStatic 
 {
 public static void main(String args[])
 {
  System.out.println(Demo.b);
  Demo d=new Demo();
  System.out.println(d.a);
  d.b=-1;
  Demo d1=new Demo();
  System.out.println(d1.a);
  System.out.println(d1.b);
 }
 }
 