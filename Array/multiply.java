public class multiply {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int multiply = 1;
        int n = arr.length;

        for(int i = 1;i<=n-1;i++){
            int value = arr[i];
            multiply *= value;
        }
        System.out.println(multiply);
    }
}
