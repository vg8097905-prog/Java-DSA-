public class Sumin2D{
    public static void main(String[] args) {
        
        int arr[][] = { {1,4,8},{3,6,9}};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int value = arr[i][j];
                sum=sum +value;
            }
            System.out.println(sum);
        }
    }
}