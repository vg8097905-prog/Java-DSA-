public class hollowRAT {
    public static void main(String[] args) {
        int n =6;
        for(int row = 1; row<=n;row++){
            for(int col=1;col<=row;col++){
                if(row==1|row==2|row==n){
                    System.out.print('*'+" ");
                }
                else{
                    if(col==1|| col==row){
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
