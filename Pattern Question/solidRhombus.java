public class solidRhombus {
    public static void main(String[] args) {
        // row =i
        // col=j

        int n = 5;
        int j = 7;

        for(int row =1;row<=n; row++){
            // space
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }

            // star
            for(int col= 1;col<=j;col++){
                System.out.print('*'+ " ");
            }
            System.out.println();
        }
    }
}
