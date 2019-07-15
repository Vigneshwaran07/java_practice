import java.util.*;
class Sumofnum
{
	static int sod(int n)
	{
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
		return tot;
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = sod(n);
		System.out.println(result);
	}
}
