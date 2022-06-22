# https://leetcode.com/problems/single-number/

class Single_Number_HashSet {

    public int singleNumber(int[] nums) {
        
		Set<Integer> set = new HashSet<Integer>();
		
		for (int num : nums) {
			
			if (set.contains(num)) {
				
				set.remove(num);
				
			} else {
				
				set.add(num);
			}
		}
		
		return set.iterator().next();
    }
}
