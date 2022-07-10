public class ArrayLeader {

	
	static int[] array = new int[]{16, 17, 4, 3, 5, 2};
	
	public static void main(String[] args) {
		
		for (int i=0; i<array.length-1; i++) {
			
			int currentNum = array[i]; 
			
			boolean isCurrentLeader = true;
			
			for (int j =i+1; j<array.length; j++) {
				
				if (currentNum < array[j]) {
					
					isCurrentLeader = false;
					break;
				}
			}
			
			if (isCurrentLeader) {
				
				System.out.println(currentNum);
			}
		}
		
		System.out.println(array[array.length-1]);
	}
}
