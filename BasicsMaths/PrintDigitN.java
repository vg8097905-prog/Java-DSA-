public class PrintDigitN {

    static void printDigits(int num){
        // agar mere num=0, toh mai rukunga.
        // agar mere num != 0, toh mai processing krta hu.

        while(num!=0){
            int digit = num%10;
            System.out.println(digit);
            // last digit remove
            num = num/10;
        }
    }
    public static void main(String[] args) {
        int num = 53127;
        printDigits(num);
    }
}
