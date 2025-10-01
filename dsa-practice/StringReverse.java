import java.util.*;
public class StringReverse {
    static String reverseString(String word){
        String rev = "";
        for(int i=word.length();i>=0;i--){
            rev+=word.charAt(i);
        }
        return rev;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(reverseString(word));
        sc.close();
    }
}
