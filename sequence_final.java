import java.util.*;
public class Sequence 
{
    public static void main(String args[])
    {
        int arr[] ={3,2,3,4,5,0};
        int start = 0, end = 0, i, j, max_size = 0, final_start = 0, final_end = 0, temp_count = 1;
        for(i=0;i<arr.length-1;i++)
        {
            start = i;
            temp_count = 1; //everytime reset the count
            for(j=i;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp_count += 1;
                    end = j+1; // end index counts till arr[j+1] 
                }
                else
                {
                  break; //terminate if it is decreasing series
                }
                if(j == arr.length-2 )
                {
                    end = j+1;  //for border condition
                    break;
                } 
            }
            
            if(max_size < temp_count && temp_count != 1)
            {
                max_size = temp_count;
                final_start = start;
                final_end = end;
                
            }
            if(j == arr.length-2)
            {
              break; // break if it is already reach end of an array
            }
            
            
        }
        System.out.println("Start : "+(final_start+1)+"");
        System.out.println("End : "+(final_end+1)+"");
        for(i=final_start;i<=final_end;i++)
        {
          System.out.print(arr[i]+" ");
        }
    }
}
