package String;

public class Comparision {
    public static void main(String[] args) {
        
        String name1 = "Vivek";
        String name2 =  "Vivek";
        if(name1 == name2){
            System.out.println("Both strings are same");
        }
        else{
            System.out.println("Both strings are not same");
        }


        String name3 = "VIVEK";
        String name4 =  "Vivek";
        if(name3.equals(name4)){
            System.out.println("Both strings are same");
        }
        else{
            System.out.println("Both strings are not same");
        }

          String name5 = "VIVEK";
        String name6 =  "Vivek";
        if(name5.equalsIgnoreCase(name6)){
            System.out.println("Both strings are same");
        }
        else{
            System.out.println("Both strings are not same");
        }
    }
}
