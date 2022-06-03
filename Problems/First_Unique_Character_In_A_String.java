# https://leetcode.com/problems/first-unique-character-in-a-string/

class First_Unique_Character_In_A_String {
    
    public int firstUniqChar(String s) {
        
		Map<Boolean, Queue<Character>> map = new HashMap<>();

		map.put(true, new LinkedList<Character>());
		map.put(false, new LinkedList<Character>());

		int i = 0;

		while (i < s.length()) {

			if (map.get(true).contains(s.charAt(i))) {

				map.get(false).remove(s.charAt(i));

			} else if (!map.get(false).contains(s.charAt(i))) {

				map.get(false).add(s.charAt(i));

			}  else {

				map.get(true).add(s.charAt(i));

				map.get(false).remove(s.charAt(i));
			}

			i++;
		}

		if (map.get(false).isEmpty()) {

			return -1;
		}

		char ch = map.get(false).poll();

		return s.indexOf(ch);
    }
}
