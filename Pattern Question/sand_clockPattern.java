public class sand_clockPattern {
    public static void main(String[] args) {
         int n = 5;
        //  part-1
        for(int row=1;row<=n; row++){
            // spaces
            for(int col =1;col<=row-1;col++)
                System.out.print("  ");
            // star
            for(int col = 1; col<=2*n-2*row+1;col++){
                System.out.print('*'+ " ");
            }
            System.out.println();
        }

        // part-2
         for(int row = 2; row<=n; row++){
            // spaces
            for(int col =1;col<=n-row;col++)
                System.out.print("  ");

            for(int col=1;col<=2*row-1;col++){
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
}
