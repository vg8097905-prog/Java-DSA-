public class LargestNM {
    
     static int getMaximum (int a,int b){

        if(a>b){
            return a;
        }else{
             return b;
        }
       
    }

    public static void main(String[] args) {
        int result = getMaximum (20,9);
        System.out.println(result);
    }
}
