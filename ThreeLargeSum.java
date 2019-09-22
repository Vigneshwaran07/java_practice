package hydra;
import java.util.*;
public class ThreeLargeSum 
{
	public static int extract(String str)
	{
		TreeSet<String> tlist = new TreeSet<>(Arrays.asList(str.split("")));
		ArrayList<String> list = new ArrayList<>(tlist);
		Collections.sort(list, Collections.reverseOrder());
		String res = list.get(0)+ list.get(1)+ list.get(2);
		return Integer.parseInt(res);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String inp1 = sc.next();
		String inp2 = sc.next();
		String inp3 = sc.next();
		int total = extract(inp1)+extract(inp2)+extract(inp3);
		System.out.println(total);
		sc.close();	
	}
}
