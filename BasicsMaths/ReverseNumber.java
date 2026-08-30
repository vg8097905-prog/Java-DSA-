public class ReverseNumber {

    static int reverseNumber(int num){
        int revNum = 0;

        while(num!=0){
           int digit =  num%10;
           revNum= revNum * 10 + digit;
           num = num/10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        int num = 1234;
        // int ans = ReverseNumber(num);
        // System.out.println(ans);
        System.out.println(reverseNumber(num));
    }
}
