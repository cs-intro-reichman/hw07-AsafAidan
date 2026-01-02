/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0].toLowerCase()));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		if (s.length() == 1 || s.length() == 0) {
			return true;
		}
		if (s.charAt(s.length() - 1) != s.charAt(0)) {
			return false;
		}
		return isPalindrome(s.substring(1, s.length() - 1));
    }
}