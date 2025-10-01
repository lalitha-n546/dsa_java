import java.util.Scanner;

public class switch_{
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a fruit name: ");
       String fruit = in.next();

        //There is a invisible break statement  
       switch (fruit) {
            case "mango" -> System.out.println("King of fruits.");
            case "apple" -> System.out.println("A red fruit.");
            case "banana" -> System.out.println("A yellow fruit, rich in potassium.");
            case "orange" -> System.out.println("A citrus fruit full of Vitamin C.");
            case "grapes" -> System.out.println("Small, sweet or sour berries.");
            default -> System.out.println("Unknown fruit. Try again!");
       }

       in.close();
   }
}
 
    

