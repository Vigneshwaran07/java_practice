package hydra;
import java.util.*;
public class Wordlength
{
	static int sumofdigits(int n)
	{
		int rem = 0,t = 0;
		while(n!=0)
		{
			rem = n%10;
			t += rem;
			n = n/10;
		}
		if(t>9)
		{
			t = sumofdigits(t);
		}
		return t;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] inp1 = sc.nextLine().split(" ");
		String res = "";
		int len;
		for(String i : inp1)
		{
			len = i.length();
			if(len>9)
			{
				len = sumofdigits(len);
			}
			res += len+"";
		}
		System.out.println(res);
		sc.close();
	}

}
