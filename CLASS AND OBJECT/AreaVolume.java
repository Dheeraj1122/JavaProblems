class Room
{
 void area(double a,double b)
 {
  double area=a*b;
  System.out.println("area of room is "+area);
 }
 void volume(int l,int b,int h)
 {
   int volume = l*b*h;
   System.out.println("volumee of room is "+volume);
 }
}
class AreaVolume
{
  public static void main(String args[])
  {
   Room r=new Room();
   r.area(3.10,4.2);
   r.volume(2,2,2);
  }
}