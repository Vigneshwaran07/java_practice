import java.util.*;
public class SmallestTwo 
{
	public static int extract(String str)
	{
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split("")));
		Collections.sort(list);
		String res = list.get(0) + list.get(1);
		return Integer.parseInt(res);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int total = extract(sc.next()) + extract(sc.next()) + extract(sc.next()) + extract(sc.next()) + extract(sc.next()) ;
		System.out.println(total);
		sc.close();
	}

}

