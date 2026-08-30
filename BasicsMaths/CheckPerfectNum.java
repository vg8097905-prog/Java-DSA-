public class CheckPerfectNum {
    static boolean checkPerfectNum(int num){
        int sum = 1;
        for(int i = 2; i*i<=num;i++){
            if(num%i==0){
                // 'i' ne num ko perfectly divide kardia h
                // toh ab factor pair kya banega
                // 1st factor -> i
                // 2nd factor -> num/i
                int firstFactor = i;
                int secondFactor = num/i;
                sum = sum + firstFactor+secondFactor;
            }
        }
        if(sum==num){
            return true ;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNum(6));
    }
}
