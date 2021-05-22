package v1.leetcode.arrayandstring;

/**
 *
 * @NOTE: A simple String Question to practice edge cases
 *
 * https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1161/
 */
public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
		int res = -1;

		// Empty String is always a match
		if(needle.length() == 0) return 0;

		if (haystack.length() == 0) return -1;

		// Same Length but different Strings
		if (haystack.length() == needle.length()){
			return haystack.equals(needle)? 0 : -1;
		}

		for (int i=0; i<haystack.length(); i++){
			int hIndex = i;
			int nIndex = 0;

			// Optimization to reduce comparision
			if(i+needle.length() > haystack.length()) return -1;

			while (hIndex<haystack.length() && nIndex<needle.length() &&
			       haystack.charAt(hIndex) == needle.charAt(nIndex)){
				hIndex++;
				nIndex++;
			}

			// Have compared all the Characters of Needle
			if(nIndex == needle.length())
				return i;
		}

		return res;

	}
}
