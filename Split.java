package hydra;
import java.util.*;
public class Split {

	static String split(String str1)
	{
		StringBuilder str = new StringBuilder();
		str.append(str1);
		int d = str.length()/3;
		if(str1.length()%3==0 || str1.length()%3==1)
		{
			str.insert(d, "-");
			str.insert(str1.length()-d+1, '-');	
		}
		if(str1.length()%3==2)
		{
			str.insert(d+1, "-");
			str.insert(str1.length()-d, '-');
		}
		return str.toString();
	}
	
	static String toggle(String str)
	{
		char re[] = str.toCharArray();
		for(int i = 0;i<str.length();i++)
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
		return result;
	}	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] str1 = split(sc.next()).split("-");
		String[] str2 = split(sc.next()).split("-");
		String[] str3 = split(sc.next()).split("-");
		String op1 = str1[0]+str2[1]+str3[2];
		String op2 = str1[1]+str2[2]+str3[0];
		String op3 = str1[2]+str2[0]+str3[1];
		op3 = toggle(op3);
		System.out.println(op1+"\n"+op2+"\n"+op3);
		sc.close();
	}
}
