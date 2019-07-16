import java.util.*;
public class Sumofnum
{
    static int f=0;
    static int sod(int n)
    {
        if(n<0)
        {
            n = -1*n;
            f=1;
        }
        int tot = 0, rem = 0;
        while(n!=0)
        {
            rem = n%10;
            tot += rem;
            n = n/10;
        }
        if(tot>9)
        {
            tot = sod(tot);
        }
        if(f==1)
        {
            tot = tot*-1;
        }
        return tot;
    }
    public static void main(String args[])
    {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sod(n);
        System.out.println(result);
    }
}
