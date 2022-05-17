class WarmerDays2 {
    
    public int[] dailyTemperatures(int[] temps) {
        
		int[] result = new int[temps.length];

		result[temps.length - 1] = 0;

		int current = 0;
		int next = 1;

		while (current < temps.length - 1) {

			if (temps[current] < temps[next]) {

				result[current] = next - current;
				current++;
				next = current + 1;
				
			} else if (next == temps.length - 1) {
				
				current++;
				next = current + 1;
				continue;
				
			} else {
				
				next++;
			}
		}

		return result;
    }
}
