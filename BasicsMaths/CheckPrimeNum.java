public class CheckPrimeNum {
    
    static boolean isPrimeOrNot(int num){
        // cond:i*i<=num;
        // i<=root of n;
        // i<=num-1;
        for(int i = 2;i*i<=num;i++){
            if(num%i == 0){
                // not a prime
                return false;
            }
        }
        // yaha tabhi pahuch paoge , jab loop se bahar nikloge or loop se bahar tabhi nikloge , jab kabhi bhi remainder 0 nahi aaye iska mtlb its a prime number.

        return true;
    }

    public static void main(String[] args) {
        int num =9;
        System.out.println(isPrimeOrNot(num));
    }
}
