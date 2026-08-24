public class CalculateM {
    
    static double calculatePercentage(int Obtained,int Total){
        // double calculate = (Obtained/(double)Total)*100;
        // System.out.println(calculate);
        return ( (double)Obtained/Total*100 );
    }

    public static void main(String[] args) {
        double result=calculatePercentage(50,500);
        System.out.println(result+" " + "%");
    }
}
