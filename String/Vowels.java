package String;

public class Vowels {  
    static int getVowelCount(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                count ++;
            }
        }
        return count;
    } 
    public static void main(String[] args) {
        String str = "vivek";
        System.out.println(getVowelCount(str));
    }
}
