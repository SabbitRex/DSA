public class ReorganizeArray {

	public static String reorganizeString(String s) {

		int[] frequency = new int[26];

		for (int i = 0; i < s.length(); i++) {
			frequency[s.charAt(i) - 'a']++;
		}

		int maxFrequency = 0;
		int indexOfMaxFrequency = 0;

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > maxFrequency) {
				maxFrequency = frequency[i];
				indexOfMaxFrequency = i;
			}
		}

		if (maxFrequency > (s.length() + 1) / 2) {

			return "";
		}

		char[] res = new char[s.length()];

		int index = 0;

		while (frequency[indexOfMaxFrequency] > 0) {

			res[index] = (char) (indexOfMaxFrequency + 'a');
			frequency[indexOfMaxFrequency]--;
			index += 2;
		}

		for (int i = 0; i < frequency.length; i++) {

			while (frequency[i] > 0) {

				if (index >= res.length) {

					index = 1;
				}

				res[index] = (char) (i + 'a');
				index += 2;
				frequency[i]--;
			}
		}

		return String.valueOf(res);
	}

	public static void main(String[] args) {

		String s = "baaba";

		System.out.println(reorganizeString(s));
	}
}
