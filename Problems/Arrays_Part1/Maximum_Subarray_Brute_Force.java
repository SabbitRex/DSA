class Maximum_Subarray_Brute_Force {

	public static int maxSubArray(int[] arr) {

		int size = arr.length;

		int topMax = Integer.MIN_VALUE;

		for (int i = 0; i < size; i++) {

			int sum = arr[i];
			
			int currentMax = sum;

			for (int j = i + 1; j < size; j++) {

				sum = sum + arr[j];
				
				if (currentMax < sum) {

					currentMax = sum;
				}
			}

			if (currentMax > topMax) {

				topMax = currentMax;
			}
		}

		return topMax;
	}
}
