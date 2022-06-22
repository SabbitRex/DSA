class Sort_Characters_Array {

	public List<Character> sort(char[] arr) {
		
		List<Character> result = new ArrayList<>();
		
		int[] freq = new int[26];
		
		for (char c : arr) {
			
			freq[c - 'a']++;
		}
		
		for (int i=0; i<freq.length; i++) {
			
			if (freq[i] != 0) {
				
				while (freq[i] != 0) {
					
					char c = (char) (97 + i);
					
					result.add(c);
					
					freq[i]--;
				}
			}
		}
		
		return result;
    }
}
