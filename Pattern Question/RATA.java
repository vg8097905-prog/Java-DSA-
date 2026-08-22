public class RATA {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                int a = col;
                int b = ('A'-1);
                int ans= a+b;
                char finalans = (char)ans;
                System.out.print(finalans+" ");
            }
            System.out.println();
        }
    }
}
