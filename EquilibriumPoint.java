import java.util.ArrayList;
import java.util.List;

//Sum of left and right in array is equal from that index
public class EquilibriumPoint {

	static int[] array = { 1, 4, 2, 5 };
	
	static List<Integer> prefixSum = new ArrayList<Integer>();
	static List<Integer> sufixSum = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=0 ; i<array.length; i++) {
			
			sum = sum + array[i];
			
			prefixSum.add(sum);
		}
		
		sum = 0;
		
		for (int i = array.length-1; i>=0; i--) {
			
			sum = sum + array[i];
			
			sufixSum.add(i, sum);
		}
		
		System.out.println(prefixSum);
		
		System.out.println(sufixSum);
	}
}
