public class TripletSumZero {

	public void sum(int[] arr) {
		
		for (int i=0; i<arr.length-2; i++) {
			
			int sum = 0;
			
			for (int j= i+1; j<arr.length-1; j++) {
				
				sum = arr[i] + arr[j];
				
				int tempSum = sum;
				
				for (int k= i+2; k<arr.length; k++) {
					
					sum = tempSum;
					
					sum = sum + arr[k];
					
					if (sum == 0) {
						
						System.out.println(String.format("[%s,%s,%s]", arr[i], arr[j], arr[k]));
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		TripletSumZero obj = new TripletSumZero();
		
		int[] arr = new int[] {0, -1, 2, -3, 1};
		
		obj.sum(arr);
	}
}
