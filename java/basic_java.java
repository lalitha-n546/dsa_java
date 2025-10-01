import java.util.*;
public class basic_java {
   // "==" and .equals() difference ,the former checks the values while on latter on the refernce of the individuals.
   public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String fruit = in.next();
    
    System.out.println("Mango" == "Mango");
    System.out.println(fruit == "Mango");     // false, different object
    System.out.println(fruit.equals("Mango")); // true if user typed Mango

    
    if(fruit.equals("Mango")) {
        System.out.println("King of fruit.");
    }
    if(fruit.equals("apple")) {
        System.out.println("A red fruit.");
    }
    in.close();
   }
}
