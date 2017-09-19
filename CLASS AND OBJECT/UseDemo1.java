class Demo
{
  String FullName(String fname,String lname)
  {
   return fname+" "+lname;
   }
 }
class UseDemo1
{
 public static void main(String args[])
 {
  Demo d=new Demo();
  //String fname="ramesh";
  //String lname="Raju";
  String str=d.FullName("Raam","Sitaaaa");
  System.out.println("Full name is "+str);
  }
 }