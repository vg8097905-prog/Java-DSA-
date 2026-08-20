public class hollowPyramid {
     public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            // spaces
            for(int col =1;col<=n-row;col++){
                 System.out.print("  ");
            }
            //    star
            for(int col=1;col<=2*row-1;col++){
                if(row==1||row==n){
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
    }
}
