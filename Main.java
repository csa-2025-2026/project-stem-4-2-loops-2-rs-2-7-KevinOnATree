import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Which Problem? Input a Integer: ");
    int Prc = sc.nextInt();
    if (Prc == 1) {
    System.out.println("Enter two numbers: ");
    int min = sc.nextInt();
    int max = sc.nextInt();
    String final1 = "\n";
    for (int i = min; i <= max; i++)  {
      if (i % 2 == 1) {
      final1 += i;
      final1 += " ";
      }
    }
    System.out.println(final1);
    } else if (Prc == 2) {
      System.out.println("Enter a positive integer: ");
      int pos = sc.nextInt();
      while (pos > 0) {
      System.out.println(pos % 10);
      pos /= 10;
      }
    } else if (Prc == 3) {
      System.out.println("Enter a positive integer: ");
      int pos2 = sc.nextInt();
      int factor = 1;
      while (pos2 > 0) {
        System.out.println(pos2 % 10 * factor);
        factor *= 10;
        pos2 /= 10;
      }
    }
  }

}
