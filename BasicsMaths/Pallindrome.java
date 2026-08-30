public class Pallindrome {
     static int reverseNumber(int num){
        int revNum = 0;

        while(num!=0){
           int digit =  num%10;
           revNum= revNum * 10 + digit;
           num = num/10;
        }
        return revNum;
    }

    static boolean isPalindrome(int num){
        int originalNum=num;
        int reversedNum = reverseNumber(num);

        if(originalNum==reversedNum){
            System.out.println("It is a Paliindrome");
            return true;
        }
        else{
            System.out.println("It is not a Pallindro me");
            return false;
        }
    }


    public static void main(String[] args) {
        boolean ans = isPalindrome(1231);
        System.out.println(ans);
    }
}
