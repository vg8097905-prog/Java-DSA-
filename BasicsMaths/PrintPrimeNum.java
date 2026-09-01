public class PrintPrimeNum {
    
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

    static void printAllPrimes(int n){
        // print all prime number from 1 to N
        // 1 is not a prime number

        for(int num=2;num<=n;num++){
            boolean isPrime = isPrimeOrNot(num);
            if(isPrime==true){
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        printAllPrimes(20);
    }
}
