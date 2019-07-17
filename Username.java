package hydra;
import java.util.*;

class Username
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String name1 = sc.next();
        String name2 = sc.next();
        String pin = sc.next();
        int n = sc.nextInt();
        
        String smallname;
        String largername;
        String result;
        
        if(name1.length()>name2.length())
        {
        	smallname = name2;
        	largername = name1;
        }
        else if(name1.length()<name2.length())
        {
        	smallname = name1;
        	largername = name2;
        }
        else
        {
        	if(name1.compareTo(name2)>0)
        	{
        		smallname = name2;
            	largername = name1;
        	}
        	else
        	{
        		smallname = name1;
            	largername = name2;
        	}
        }
        result = largername.charAt(0)+smallname;
        char resarr[] = result.toCharArray();
        for(int i=0;i<result.length();i++)
        {
        	if(Character.isUpperCase(resarr[i]))
        	{
        		resarr[i] = Character.toLowerCase(resarr[i]);
        	}
        	else
        	{
        		resarr[i] = Character.toUpperCase(resarr[i]);
        	}
        }
        String fresult = new String(resarr);
        fresult = fresult+pin.charAt(n-1)+pin.charAt((pin.length()-n));
        System.out.println(fresult);
        sc.close();
        
        
    }
}
