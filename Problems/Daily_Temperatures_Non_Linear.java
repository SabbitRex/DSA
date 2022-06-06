# https://leetcode.com/problems/daily-temperatures/

class Daily_Temperatures_Non_Linear {

    public int[] dailyTemperatures(int[] temps) {
        
        int[] dayJumps = new int[temps.length];
		
		for (int i=0; i<temps.length; i++) {
			
			int jump = 0;
			
			for (int j=i+1; j<temps.length; j++) {
				
				jump++;
				
				if (temps[i] < temps[j]) {
					
					dayJumps[i] = jump;
					break;
				}
			}
		}
		
		return dayJumps;
    }
}
