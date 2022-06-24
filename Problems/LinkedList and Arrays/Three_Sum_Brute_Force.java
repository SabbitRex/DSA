import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_Sum_Brute_Force {
	
    public static List<List<Integer>> threeSum(int[] nums) {
        
    	List<List<Integer>> result = new ArrayList<>();
    	
    	Set<List<Integer>> set = new HashSet<>();
    	
    	if (nums.length < 3) {
    		
    		return new ArrayList<>();
    	}
    	
    	Arrays.sort(nums);
    	
        int size = nums.length;
        
        for (int i=0; i<size; i++) {
                
            int j = i+1;
            int k = j+1;
            
            List<Integer> local = new ArrayList<Integer>();
            
            while (k < size && j < size-1) {
                
            	int fixedNumber = nums[i];
            	int next = nums[j];
            	int nextNext = nums[k];
            	
            	int sum = fixedNumber + next + nextNext;
            	
                if (sum == 0) {
                	
                    local.add(fixedNumber);
                    local.add(next);
                    local.add(nextNext); 
                    
                	if (set.add(local)) {
                		
                		result.add(local);
                	}
                	
                	local = new ArrayList<Integer>();
                	
                	k++;
                        
                } else {
                    
                    k++;
                }
                
                if (k == size) {
                	
                	j++;
                	k = j+1;
                	
                	local = new ArrayList<Integer>();
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
		
    	System.out.println(threeSum(new int[] {0,0,0,0}));
	}
}
