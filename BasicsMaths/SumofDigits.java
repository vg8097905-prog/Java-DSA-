public class SumofDigits {
    
    static int sumofDigits(int num){
        // agar mere num=0, toh mai rukunga.
        // agar mere num != 0, toh mai processing krta hu.
        int sum=0;
        while(num!=0){
            int digit = num%10;
            sum = sum+digit;
            // last digit remove
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 53127;
        System.out.println(sumofDigits(num));
    }
}

