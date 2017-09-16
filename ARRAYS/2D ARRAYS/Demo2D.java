import java.util.Scanner;
class Demo2D
{
   public static void main(String args[])
   {
     Scanner obj = new Scanner (System.in);
	 int arr[][]=new int[4][4];
	 for(int i=0;i<4;i++)
	 {
	  for(int j=0;j<4;j++)
	  {
	    System.out.print("Enter arr["+i+"]["+j+"]:");
		
		//arr[i][j]=obj.nextInt();
       arr[i][j]=(int)(Math.random()*100); //for random value
	   System.out.print(arr[i][j]+"  ");
      } 
		System.out.println();
	}
	for(int i=0;i<4;i++)
	 {
	  for(int j=0;j<4;j++)
	  {
		//System.out.println("4*4 array is:");
		System.out.print(arr[i][j]+"\t");
	  }
	  System.out.println();
	 } 
   }
            
}