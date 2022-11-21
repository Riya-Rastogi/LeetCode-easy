package Codechefcontest;
import java.util.*;

public class pp {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n =sc.nextInt();
            int a =sc.nextInt();
            int b =sc.nextInt();
            if(a+b<=n-2)
            {
                System.out.println("YES");
            }
            else if(a==n || b==n)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("no");
            }
        }

    }
}
