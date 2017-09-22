class Demo1
{
  Demo1()
 {
  System.out.println("constructor called");
 }
 A Show()
{
  System.out.println("Show called");
  return new A();
  }
  B ShowMe()
 {
  System.out.println("Show Me called");
  return new B();
 }
  void ShowMeToo()
 {
  System.out.println("Show Me Too called");
 }
}
class A
{
  B f1()
 {
  System.out.println("f1 called");
  return new B();
 }
  C f2()
 {
  System.out.println("f2 called");
  return new C();
 }
}
class B
{
  Demo1 call()
 {
  System.out.println("Call called");
  return new Demo1();
 }
  C callme()
 {
  System.out.println("call Me called");
  return new C();
  }
}
class C
{
 A f3()
 {
  System.out.println("f3 called");
  return new A(); 
 }
 Demo1 CallMeToo()
 {
  System.out.println("call Me Too called");
  return new Demo1();
 }
}



class ReturningObject
{
 public static void main(String args[])
 {
  new Demo1().Show().f1().callme().f3().f2().CallMeToo().ShowMe().call().ShowMeToo();
 }
}