package String;

public class PrinteachChar {

    static void printString(String str){
         int n =str.length();
         for(int i = 0; i<=n-1;i++){
            char ch = str.charAt(i);
            System.out.println("Value of char: " + ch);
         }
    }


    public static void main(String[] args) {
        String str = "Vivek";
        printString(str);


        // String name = "Vivek";
        // char [] crr = name.toCharArray();
        // // name.toCharArray() --> it return char.
        // // char [] crr --> it store them.
        // // print the char array
        // for(char ch:crr){
        //     System.out.println("Value of char: " + ch);
        // }

    }
}
