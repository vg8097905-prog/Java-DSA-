import java.util.*;
public class Maximum {
    public static void main(String[] args) {
        
        int arr [] = new int[5];
        int n = arr.length;

        Scanner sc = new Scanner(System.in);

        for(int i =1;i<=n-1;i++){
            System.out.print("enter a value at a index of"+" "+i+" " + "=" + " ");
            arr[i] = sc.nextInt();
        }

        int maxValue = arr[0];
        for(int i =0;i<=n-1;i++){
         if(arr[i]>maxValue){
            maxValue=arr[i];
            }
        }
        System.out.println(maxValue);
        sc.close();
    }
}
