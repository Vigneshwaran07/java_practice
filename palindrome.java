package hydra;
import java.util.*;

public class Palindrome
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int  total = 0;
		HashMap<String, Integer> counter = new HashMap<>();
		String inp1[] = sc.next().toLowerCase().split("");
		for(String i : inp1)
		{
			if(counter.containsKey(i))
			{
				counter.put(i, counter.get(i)+1);
			}
			else
			{
				counter.put(i,1);
			}	
		}
		for(String i:counter.keySet())
		{
			total += counter.get(i)- ((counter.get(i)%2!=0)== true?1:0);
		}
		if(total < inp1.length && total != 0)
		{
			total += 1;
		}
		else if(total == 0)
		{
			total = -1;
		}
		System.out.println(total);
		sc.close();
	}
}
