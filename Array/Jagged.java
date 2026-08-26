public class Jagged {
    public static void main(String[] args) {
        
        int [][] arr = { {1,2},
                         {2,3,4,5},
                         {3,4,4,5,6,7},
                         {4}
                        };


        int rowLength = arr.length;

        for(int rowIndex = 0;rowIndex<=rowLength-1;rowIndex++){
            // jaise hi main kisi new row me aaya
            // same point par maine uss row ka colLength find out krlia
            // Current row -> arr[rowIndex]
            // isme kitne columns -> arr[rowIndex].Length

            int colLength = arr[rowIndex].length;
            for(int colIndex = 0;colIndex<=colLength-1;colIndex++){
                System.out.print(arr[rowIndex][colIndex]+"  ");
            }
            System.out.println();
        }
    }
}
