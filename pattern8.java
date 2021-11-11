import java.util.*;
class pattern8	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,k;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
            for(i=1;i<=n;i++)
             {
                   for(j=n;j>i;j--)
                    {
                                System.out.print(" ");
                    }
	    for (k = 1; k <= i; k++)
                    {
                     System.out.print("*");
	   }
                     System.out.println();
               }
       }
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
