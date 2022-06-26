# https://leetcode.com/problems/4sum/

class Four_Sum {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
		List<List<Integer>> result = new ArrayList<>();

		Arrays.sort(nums);

		for (int i=0; i<nums.length-3; i++) {

			if (i > 0 && i < nums.length-3 && nums[i] == nums[i-1]) {

				continue;
			}

			for (int j=i+1; j<nums.length; j++) {

				if (j > i+1 && j < nums.length-2 && nums[j] == nums[j-1]) {

					continue;
				}
				
				int left = j + 1;

				int right = nums.length - 1;

				while (left < right) {

					long localSum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];

					if (localSum == target) {

						List<Integer> local = new ArrayList<>();

						local.add(nums[i]);
						local.add(nums[j]);
						local.add(nums[left]);
						local.add(nums[right]);

						result.add(local);

						right--;

						while (left < right && nums[right] == nums[right+1]) {

							right--;
						}

						while (left < right && nums[left] == nums[left+1]) {

							left++;
						}

					} else if (localSum > target) {

						right--;

					} else {

						left++;
					}
				}
			}

		}

		return result;
    }
}
