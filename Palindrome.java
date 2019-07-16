package hydra;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine().toLowerCase();
		StringBuilder b = new StringBuilder();
		b.append(a);
		b.reverse();
		if(a.equals(b.toString()))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
