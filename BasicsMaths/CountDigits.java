public class CountDigits {
  
    static int countDigits(int num){
        // agar mere num=0, toh mai rukunga.
        // agar mere num != 0, toh mai processing krta hu.
        int count = 0;
        while(num!=0){
            // int digit = num%10;
            count++;
            // last digit remove
            num = num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 531271;
        int ans = countDigits(num);
        System.out.println(ans);

    }
  
}