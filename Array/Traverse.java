import java.util.*;
public class Traverse {
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of an array n:");
        int x = sc.nextInt();
        int arr[]=new int [x];
        int n = arr.length;

        // Input
        for(int i=0;i<=n-1;i++){
            System.out.print("Enter a value at index"+" "+ i +"  " +"="+"  ");
            arr[i]=sc.nextInt();
        }
        
        // output
        System.out.println("Your array value::");
        // for(int val :arr){
        //     System.out.println(val);
        // }

        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
