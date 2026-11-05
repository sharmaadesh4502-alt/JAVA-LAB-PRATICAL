public class Main {
    public static void main(String[] args) {
        String word = "racecar";
        boolean palindrome = true;
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome)
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}