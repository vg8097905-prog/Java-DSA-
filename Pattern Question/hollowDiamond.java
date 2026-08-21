public class hollowDiamond {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            // part-1
            // spaces
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            // star
            for(int col=1;col<=2*row-1;col++){
                if(row==1){
                    System.out.print('*'+" ");
                }
                else{
                    if(col==1||col==2*row-1){
                        System.out.print('*'+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                } 
            }
            System.out.println();
        }
            // part-2
            for(int row=2;row<=n;row++){
                // if(row==1){
                //     continue;
                // }
                 for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }

            // star
            // for(int col=1;col<=2*n-2*row+1;col++){
            //     if(row==n){
            //         System.out.print('*'+" ");
            //     }
            //     else{
            //         if(col==1||col==2*n-2*row+1){
            //             System.out.print('*'+" ");
            //         }
            //         else{
            //             System.out.print("  ");
            //         }
            //     }
            // }

            if(row==n){
                System.out.print('*'+" ");
            }
            else{
                System.out.print('*'+" ");
                
                for(int col=1;col<=2*n-2*row-1;col++){
                    System.out.print("  ");
                }

                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
}
