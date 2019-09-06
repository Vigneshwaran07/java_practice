import java.util.*;
public class Sequence 
{
    public static void main(String args[])
    {
        int arr[] = {2,1,6,7,8,9};
        int start = 0, end = 0, i, j, max_size = 0, final_start = 0, final_end = 0, temp_count = 1;
        for(i=0;i<arr.length-1;i++)
        {
            start = i;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp_count += 1;
                }
                else
                {
                    end = j;
                    break;
                }
                
            }
            if(max_size < temp_count)
            {
                max_size = temp_count;
                final_start = start;
                final_end = end-1;
                temp_count = 1;
            }
            
        }
        System.out.println(final_start);
        System.out.println(final_end);
    }
}
