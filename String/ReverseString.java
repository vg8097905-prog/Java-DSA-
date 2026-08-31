package String;
public  class ReverseString {
    
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

    public static void main(String[] args){
        String str = "Vivek";
        System.out.println(reverseString(str));
    }
}
