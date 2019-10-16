package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {

  public static void main(String[] args) {
    askYou();
  }

  static void askYou() {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello. What is your name?");
    String name = input.next();
    System.out.println("");

    System.out.println("Hi, " + name + "!  How old are you?");
    String age = input.next();
    System.out.println("");

    System.out.println(
        "So you're "
            + age
            + ", eh?  That's not old at all!\n"
            + "How much do you make, "
            + name
            + "?");
    Double d = input.nextDouble();
    System.out.println("");

    System.out.println(Double.toString(d) + "! I hope that's per hour and not per year! LOL!");
  }
}
