package String;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String Content:");
         String var = sc.nextLine();
         System.out.println("Value of nextLine:"+var);

        System.out.println("Enter the String Content:");
         String str = sc.next();
         System.out.println("Value of nextLine:"+ str);

         sc.close();

    }
    
}
