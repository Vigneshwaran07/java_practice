package hydra;
import java.util.*;
public class SeriesOfSeries {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = sc.nextInt();
		int inc = sc.nextInt();
		int tot  = start, temp = start;
		for(int i = 1; i < n; i++)
		{
			tot += (temp*i) + (temp+inc)*(i+1);
			temp += inc;
		}
		System.out.println(tot);
	}
}
