package hydra;
import java.util.*;
public class Stringreverse {
	static String reversestring(String str1[])
	{
		String re="";
		for(String s:str1)
		{
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			sb.reverse();
			re += sb.toString()+" ";
		}
		return re.trim();
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String ostring = sc.nextLine();
		String[] str1 = ostring.split(" ");
		int opt = sc.nextInt();
		if(opt==0)
		{
			System.out.println(reversestring(str1));
		}
		if(opt==1)
		{
			char re[] = reversestring(str1).toCharArray();
			char org[] = ostring.toCharArray();
			for(int i = 0;i<re.length;i++)
			{
				if(Character.isUpperCase(org[i]))
				{
					re[i] = Character.toUpperCase(re[i]);
				}
				else
				{
					re[i] = Character.toLowerCase(re[i]);
				}
			}
			String result = new String(re);
			System.out.println(result);
		}
		if(opt==2)
		{
			char re[] = reversestring(str1).toCharArray();
			
			for(int i = 0;i<re.length;i++)
			{
				if(Character.isUpperCase(re[i]))
				{
					re[i] = Character.toLowerCase(re[i]);
				}
				else
				{
					re[i] = Character.toUpperCase(re[i]);
				}
			}
			String result = new String(re);
			System.out.println(result);
			
		}
		sc.close();
		
		
	}

}
