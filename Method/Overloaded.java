public class Overloaded {
    
    static void display(int num){
        System.out.println(num);
        // int multiply = 10*num;
        // return multiply;
    }

     static void display(String name){
        System.out.println(name);
        // String fullName=name;
        // return fullName;
    }

    public static void main(String[]args){
        display(150);
        display("Vivek");
    }
}
