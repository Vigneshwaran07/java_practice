package hydra;
import java.util.*;
public class Encodedarray
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] inp1 = sc.nextLine().split(",");
		int[] arr = new int[inp1.length];
		int i = 0;
		for(String k : inp1)
		{
			arr[i++] = Integer.parseInt(k);
		}
		int first = arr[0];
		int tot = Arrays.stream(arr).sum();
		System.out.println(first);
		System.out.println(tot);
		for(i=0;i<inp1.length-1;i++)
		{
			arr[i] = arr[i] + arr[i+1];
		}
		String res = Arrays.toString(arr);
		System.out.println(res);
		sc.close();
	}

}
