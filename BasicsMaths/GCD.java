public class GCD {
    // GCD- Greatest Common Divisor. 
    // Euclidieun algorithm

    static int getGCD(int a,int b){
        // gcd(a,b)=gcd(b,a%d);

        while(b!=0){
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb;
        }
        // jab mera 'b' hoga,tab 'a' ki place pr gcd milega 
        int ans = a;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getGCD(18,12));
    }
}
 