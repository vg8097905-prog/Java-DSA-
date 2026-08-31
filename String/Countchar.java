package String;

public class Countchar {

    // in this question we count length of String  without using length().
    static int getLengthOfString(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }
    public static void main(String[] args) {
        String str = "Vivek";
        System.out.println(getLengthOfString(str));
    }
}
