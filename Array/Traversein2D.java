public class Traversein2D {
    public static void main(String[] args) {
        int [][] arr = { {1,2},{2,3},{3,4},{4,5}};

        // System.out.println(arr[2][1]);
        // System.out.println(arr[1][0]); 
        // this is use for single element.

        int rowLength = arr.length;
        int colLength = arr[0].length;

        for(int rowIndex = 0;rowIndex<=rowLength-1;rowIndex++){
            for(int colIndex = 0;colIndex<=colLength-1;colIndex++){
                System.out.print(arr[rowIndex][colIndex]+"  ");
            }
            System.out.println();
        }
    }
}
