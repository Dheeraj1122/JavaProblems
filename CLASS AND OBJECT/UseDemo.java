import java.util.Scanner;

class Demo
{
  
   void sum(int arr[])
   {
     int sum=0;
    for(int i=0;i<arr.length;i++)
	{
	 sum=sum+arr[i];
	}
	System.out.println("sum is:"+sum);
   }
}

class UseDemo
{
 public static void main(String arg[])
 {
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the size of array");
 int size=sc.nextInt();
 int a[]=new int[size];
 for(int i=0;i<size;i++){
	a[i]=(int)(Math.random()*100);
	System.out.println(a[i]+" "+ i );
 }
 Demo d=new Demo();
  d.sum(a);
  }
}