import java.util.Scanner;
class DemoSum
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter no of Rows");
	 int rows = sc.nextInt();
	 System.out.println("Enter no of columns");
	 int cols = sc.nextInt();
	 int m1[][]=new int[rows][cols];
	 int m2[][]=new int[rows][cols];
	 int m3[][]=new int[rows][cols];
	 
      System.out.println("INSERTING 1ST MATRIX:"); 
	  System.out.println();
	 for(int i=0;i<rows;i++)
	 {
	  for(int j=0;j<cols;j++)
	  {
	    System.out.print("Enter arr["+i+"]["+j+"]:");
		
		//m1[i][j]=sc.nextInt();
       m1[i][j]=(int)(Math.random()*100); //for random value
	   System.out.print(m1[i][j]+"  ");
      } 
		System.out.println();
	}
	System.out.println();
	System.out.println("INSERTING 2ST MATRIX:");
	System.out.println();
	for(int i=0;i<rows;i++)
	 {
	  for(int j=0;j<cols;j++)
	  {
	    System.out.print("Enter arr["+i+"]["+j+"]:");
		
		//m2[i][j]=sc.nextInt();
       m2[i][j]=(int)(Math.random()*50); //for random value
	   System.out.print(m2[i][j]+"  ");
      } 
		System.out.println();
	}
	System.out.println();
	System.out.println("DISPLAYING 1ST MATRIX:");
	System.out.println();
	for(int i=0;i<rows;i++)
	 {
	  for(int j=0;j<cols;j++)
	  {
		//System.out.println("4*4 array is:");
		System.out.print(m1[i][j]+"\t");
	  }
	  System.out.println();
	 }
	 System.out.println();
      System.out.println("DISPLAYING 2ND MATRIX:");	
	 System.out.println();	  
	 for(int i=0;i<rows;i++)
	 {
	  for(int j=0;j<cols;j++)
	  {
		//System.out.println("4*4 array is:");
		System.out.print(m2[i][j]+"\t");
	  }
	  System.out.println();
	 }
	 System.out.println();
	 System.out.println("SUM OF ARRAY IS:");
	 System.out.println();
	 for(int i=0;i<rows;i++)
	 {
	  for(int j=0;j<cols;j++)
	  {
		//System.out.println("4*4 array is:");
		m3[i][j]=m1[i][j]+m2[i][j];
		System.out.print(m3[i][j]+"\t");
	  }
	  System.out.println();
	 }
   }
            
}