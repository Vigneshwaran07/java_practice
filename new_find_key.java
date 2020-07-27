package viky.java;
import java.util.*;
public class one {
	
	static int findkey(int input1, int input2, int input3)
    {
        String one[] = (input1+"").split("");
        String two[] = (input2+"").split("");
        String three[] = (input3+"").split("");
        List<Integer> list = Arrays.asList(Integer.parseInt(three[0]),Integer.parseInt(three[1]), Integer.parseInt(three[2]), Integer.parseInt(three[3]) );  
        int result = Integer.parseInt(one[1])*Integer.parseInt(two[2])* Collections.max(list);
  
        return result ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(findkey(3521,2452,1352));

	}

}
