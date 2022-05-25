class SubsetOfArrayIteration {

    public List<List<Integer>> subsets(int[] nums) {
        
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		result.add(new ArrayList<Integer>());
		
		for (int n : nums) {
			
			int resultSize = result.size();
			
			for (int i =0; i<resultSize; i++) {
				
				List<Integer> temp = new ArrayList<>(result.get(i));
				temp.add(n);
				result.add(temp);
			}
		}
		
		return result;
    }
}
