public class CallbyValue {
    
    static void updateValue(int x){
           x = 100;
        System.out.println(x);
    }

    public static void main(String[] args) {
        
        int x=5;
        System.out.println(x);
        updateValue(x);
        System.out.println(x);
    }
}
