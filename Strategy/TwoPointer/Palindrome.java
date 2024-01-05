class Palindrome {

    static boolean isPalindrome(String s) {
        int si = 0, ei = s.length() - 1;
        while (si <= ei) {
            if (s.charAt(ei) != s.charAt(si))
                return false;

            si += 1;
            ei -= 1;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is ABBA Palindrome " + isPalindrome("ABBA"));
    }
}