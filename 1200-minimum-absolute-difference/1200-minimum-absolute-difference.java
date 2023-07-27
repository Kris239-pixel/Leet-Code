import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Solution {
   
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // Step-1: Sort an Array
         Arrays.sort(arr);
        //  declare & Initialise the min_diff var.
         int min_diff=Integer.MAX_VALUE;
            //Traversing
        for(int i=0;i<arr.length-1;i++)
        {
            //Finding the min.Diff
            int diff=arr[i+1]-arr[i];
            if(min_diff>diff)
            {
                min_diff=diff;
            }
        }
             // Creating result List  
     List<List<Integer>> result=new ArrayList<>();
        
        for(int  i=0;i<arr.length-1;i++)
        {
           int diff=arr[i+1]-arr[i];
            //Created Pair List for print pairs
            List<Integer> pair=new ArrayList<>();
            if(min_diff==diff)
            {
                pair.add(arr[i]);//adding an element in pair
                pair.add(arr[i+1]);//adding 2nd elemnet in pair
                result.add(pair); //add pair list in result list 
             }
         }
        
         return result;
       
    }
        
}