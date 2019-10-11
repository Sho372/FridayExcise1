package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {

  public static void main(String[] args) {
    askYou();
  }

  static void askYou() {
    Scanner input = new Scanner(System.in);
    System.out.print("Hello. What is your name?");
    String name = input.next();
    System.out.println("");

    System.out.print("Hi, " + name + "!  How old are you?");
    int age = input.nextInt();
    System.out.println(
        "Did you know that in five years you will be "
            + (age + 5)
            + " years old?\nAnd five years ago you were "
            + (age - 5)
            + "! Imagine that!");
  }
}
