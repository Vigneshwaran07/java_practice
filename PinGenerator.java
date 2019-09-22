import java.util.*;
public class PinGenerator 
{
	public static String maxi(String str1, String str2, String str3, int order, String option)
	{
		ArrayList<Integer> list = new ArrayList<>();
		int res = 0;
		list.add(Character.getNumericValue(str1.charAt(str1.length()-order)));
		list.add(Character.getNumericValue(str2.charAt(str2.length()-order)));
		list.add(Character.getNumericValue(str3.charAt(str3.length()-order)));
		if(option.equals("min"))
		{
			res = Collections.min(list);
		}
		else if(option.equals("max")) 
		{
			res = Collections.max(list);
		}
		return res+"";
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String inp1 = sc.next();
		String inp2 = sc.next();
		String inp3 = sc.next();
		String result = maxi(inp1,inp2,inp3,4,"max") + maxi(inp1,inp2,inp3,2,"min") + maxi(inp1,inp2,inp3,3,"max") + maxi(inp1,inp2,inp3,1,"min");
		System.out.println(Integer.parseInt(result));
		sc.close();
	}
}
