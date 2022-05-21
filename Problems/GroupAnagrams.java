class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        
		Map<String, ArrayList<String>> map = new HashMap<>();
		
		for (int i=0; i<strs.length; i++) {
			
			char[] ch = strs[i].toCharArray();
			
			Arrays.sort(ch);
			
			String key = new String(ch);
			
			if (map.containsKey(key)) {
				
				ArrayList<String> local =  map.get(key);
				
				local.add(strs[i]);
				
				map.put(key, local);
				
			} else {
				
				ArrayList<String> local = new ArrayList<>();
				
				local.add(strs[i]);
				map.put(key, local);
			}
		}
		
		return new ArrayList(map.values());
    }
}
