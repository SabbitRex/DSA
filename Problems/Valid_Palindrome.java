class Valid_Palindrome {
    
    public boolean isPalindrome(String s) {
        
		s = s.replace(" ", "").toLowerCase();

		if (s.length() == 1) {

			return true;
		}

		int f = 0;

		int r = s.length() - 1;

		while (f < r) {

			char front = s.charAt(f);

			char rear = s.charAt(r);

			while (!((front >= 'a' && front <= 'z') || (front >= '0' && front <= '9')) && f < r) {
                
				f++;
				front = s.charAt(f);
			}

			while (!((rear >= 'a' && rear <= 'z') || (rear >= '0' && rear <= '9')) && r > f) {
                
				r--;
				rear = s.charAt(r);
			}

			if (front != rear) {
                
				return false;
			}

			f++;
			r--;
		}

		return true;
    }
}
