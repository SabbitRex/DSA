class MaxWater {
    
    public int maxArea(int[] height) {
        
		int size = height.length;

		int globalMax = 0;

		for (int i = 0; i < size; i++) {

			int step = 1;

			int currentMin = 0;

			int localSum = 0;

			for (int j = i + 1; j < size; j++) {

				if (height[i] < height[j]) {

					currentMin = height[i];
					
				} else {
					
					currentMin = height[j];
				}

				if (localSum < (currentMin * step)) {

					localSum = currentMin * step;
				}

				step++;
			}

			if (globalMax < localSum) {

				globalMax = localSum;
			}
		}

		return globalMax;
    }
}
