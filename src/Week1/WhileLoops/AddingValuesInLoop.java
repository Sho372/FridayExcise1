package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {

  public static void main(String[] args) {
    askYou();
  }

  static void askYou() {

    int sum = 0;

    System.out.println("I will add up the numbers you give me.");
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.print("Number: ");

      int n = input.nextInt();
      sum += n;
      if (n == 0) break;
      System.out.println("The total so far is " + sum);
    }
    System.out.println("");
    System.out.println("The total is " + sum + ".");
  }
}
