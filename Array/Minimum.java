public class Minimum {
    public static void main(String[] args) {
        
        int arr[] = {2,4,7,3,-1,5,0};
        int n = arr.length;
        int minValue = arr[0];

        for(int i = 1;i<=n-1;i++){
            if(arr[i]<minValue)
                minValue=arr[i];
        }
        System.out.println(minValue);
    }
}
