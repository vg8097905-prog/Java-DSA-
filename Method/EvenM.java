public class EvenM {
    
    static boolean isEven(int num){
        // if(num%2==0){
        //     return true;
        // }
        // return false;

            return num % 2 == 0;

    }

    public static void main(String[] args) {
        int number=4;
        System.out.println(number +" " +"is even:" + isEven(number));
        // boolean result=isEven(number);
        // System.out.println(result);
    }
}
