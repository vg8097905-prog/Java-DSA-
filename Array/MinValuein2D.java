public class MinValuein2D {
    public static void main(String[] args) {
        
              int arr [][]= { {1,7,-3},{6,8,-5} };
        int minValue = arr[0][0];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] < minValue){
                    minValue = arr[i][j];
                }
            }
        }
        System.out.println(minValue);
    }
}
