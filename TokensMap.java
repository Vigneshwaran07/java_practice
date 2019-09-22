package test;
import java.util.*;
import java.math.*;
public class tokens {

	public static void main(String[] args)
	{
		int n = 10, flag = 0;
		/*int arr1[] = {99,46,39,102,45,521,65,4,47,741};
		String arr2[] = {"Rajesh", "Abdul","Rahul","priya","Sanjay","Nidhi","Varun", "Varsha", "Basil","Asif"};*/
		
		int arr1[] = {9,89,5,0,6,65,4};
		String arr2[] = {"aa","bb","cc","dd","ee","ff","gg"};
		n = 7;
		
		
		HashMap<Integer, String> dir = new HashMap<>();
		for(int i =0;i<n;i++)
		{
			dir.put(arr1[i], arr2[i]);
		}
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i<n-1;i++)
		{
			
			list.add(arr1[i]);
			for(int j = i+1;j<n;j++)
			{
				if((Math.abs(arr1[i]-arr1[j])==1) || (Math.abs(arr1[i]-arr1[j])==2))
				{
					list.add(arr1[j]);
				}
				if(list.size()==3)
				{
					flag = 1;
					break;
				}
			}
			if(list.size()!=3)
			{
				list.clear();
			}
			if(flag == 1)
			{
				break;
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		String res = dir.get(list.get(0)) + ":" + dir.get(list.get(1)) + ":" + dir.get(list.get(2));
		System.out.println(res);
		
	}
}
