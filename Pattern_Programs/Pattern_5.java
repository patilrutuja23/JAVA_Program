import java.util.*;
public class Pattern_5 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=n;i>=1;i--)
       {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%d ",i);
            }
            System.out.println();
       }
    }
}


