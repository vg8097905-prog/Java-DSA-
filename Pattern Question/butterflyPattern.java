public class butterflyPattern {
    public static void main(String[] args) {
        int n =6;
        for(int row=1; row<=n;row ++){
            // part-1
            for(int col=1;col<=row;col++){
                System.out.print('*'+" ");
            }

            for(int col=1;col<=2*(n-row);col++){
                System.out.print("  ");
            }

            for(int col=1;col<=row;col++){
                System.out.print('*'+" ");
            }
            System.out.println();
        }

        // part-2
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print('*'+" ");
            }

            for(int col=1;col<=2*(row-1);col++){
                System.out.print("  ");
            }

            for(int col=1;col<=n-row+1;col++){
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
}
