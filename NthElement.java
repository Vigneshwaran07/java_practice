import java.util.*;
public class NthElement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		int inp3 = sc.nextInt();
		int diff = (inp2 - inp1) + (inp3 - inp2);
		int n = sc.nextInt(), res = 0;
		System.out.println(diff);
		if(n%2 != 0)
		{
			res = inp1 + (((n+1)/2)-1)*diff;
		}
		else
		{
			res = inp2 + ((n/2)-1)*diff;
		}
		System.out.println(res);
	}

}
