public class LCM {
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

    static int getLCM(int a, int b){
        int gcd = getGCD(a, b);
        // gcd(18,12)=6
        int prod = a*b;
        // prod(a,b)->216
        int lcm = prod/gcd;
        // 216/6=36
        return lcm;
    }

    public static void main(String[] args) {
        System.out.println(getLCM(18,12));
    }
}
