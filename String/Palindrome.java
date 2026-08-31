package String;

public class Palindrome {

      static String reverseString(String str){
        String reverse = "";
        int n= str.length();
        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            // in case of string here congatination in occur not addition.
            reverse = reverse + ch;
        }
        return reverse;
    }
    static boolean isPalindrome(String str){
        String original = str;
        String reverse = reverseString(original);

        // compare both
        for(int i=0; i<original.length();i++){
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);

            if(ch1 != ch2){
                //no match
                return false;
            }
        }

        // loop se bahar main tabhi aaunga jab sare character  match 
        // kar rahe honge iska matlab return true .
        return true;
    }

    public static void main(String [] args){
        String str = "MOM";
        System.out.println(isPalindrome(str));
    }
}
