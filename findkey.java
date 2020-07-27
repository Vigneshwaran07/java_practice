package viky.java;

public class one {
	
	static int findkey(int input1, int input2, int input3)
    {
        String one[] = (input1+"").split("");
        String two[] = (input2+"").split("");
        String three[] = (input3+"").split("");
        String result = "";
        result += Math.max(Math.max(Integer.parseInt(one[0]), Integer.parseInt(two[0])), Integer.parseInt(three[0]))+"" ;
        result += Math.max(Math.max(Integer.parseInt(one[1]), Integer.parseInt(two[1])), Integer.parseInt(three[1]))+"" ;
        result += Math.max(Math.max(Integer.parseInt(one[2]), Integer.parseInt(two[2])), Integer.parseInt(three[2]))+"" ;
        result += Math.max(Math.max(Integer.parseInt(one[3]), Integer.parseInt(two[3])), Integer.parseInt(three[3]))+"" ;
        return Integer.parseInt(result) ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(findkey(3521,2452,1352));

	}

}
