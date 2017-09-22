class Demo1
{
int a=10; //instance variable
 Demo1()
 {
  int a=50; //local variable
  System.out.println("value of a is:"+a);
  System.out.println("now value of a is:"+this.a); //call instance
  }
  void show()
  {
   System.out.println("value of a will be:"+a);
  }
}
class UseDemo2
{
 public static void main(String args[])
 {
  Demo1 d=new Demo1();
  d.show();
  }
}