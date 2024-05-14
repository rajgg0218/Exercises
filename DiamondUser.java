import java.util.Scanner;

public class DiamondUser {
   public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int n = reader.nextInt();

      for (int i = 0; i < n; i++) {
         for (int j = 0; j <= i; j++) { // executing
            System.out.print("* ");
         }
         System.out.println("");
      }

      for (int i = n; i > 0; i--) {
         for (int j = i - 1; j > 0; j--) { // executing
            System.out.print("* ");
         }
         System.out.println("");
      }
   }
}