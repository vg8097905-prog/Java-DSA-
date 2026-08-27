public class Sum{
    public static void main(String[] args) {

        int arr[] = {10,20,30,40};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<=n-1;i++){
            int value = arr[i];
            sum = sum + value;
        }
        System.out.println(sum);
    }
}