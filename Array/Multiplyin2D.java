public class Multiplyin2D {
    public static void main(String[] args) {
        int arr[][] = { {1,4,8},{3,6,9}};
        int multiply=1;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int value = arr[i][j];
                multiply=multiply*value;
            }
        }
         System.out.println(multiply);
    }
}
