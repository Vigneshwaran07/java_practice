package viky.java;
import java.util.*;
public class one {
	
	static int findkey(int input1, int input2, int input3)
    {
        String one[] = (input1+"").split("");
        String two[] = (input2+"").split("");
        String three[] = (input3+"").split("");
        List<Integer> listone = Arrays.asList(Integer.parseInt(one[0]),Integer.parseInt(one[1]), Integer.parseInt(one[2]), Integer.parseInt(one[3]) );  
        List<Integer> listtwo = Arrays.asList(Integer.parseInt(two[0]),Integer.parseInt(two[1]), Integer.parseInt(two[2]), Integer.parseInt(two[3]) );  
        List<Integer> listthree = Arrays.asList(Integer.parseInt(three[0]),Integer.parseInt(three[1]), Integer.parseInt(three[2]), Integer.parseInt(three[3]) );  

        int result = (Collections.min(listone)+Collections.min(listtwo)+Collections.min(listthree)) - (Collections.max(listone)+Collections.max(listtwo)+Collections.max(listthree));
  
        return result ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(findkey(3521,2452,1352));

	}

}
