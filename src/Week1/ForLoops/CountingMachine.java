package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {

  public static void main(String[] args) {
    printCnt();
  }

  static void printCnt() {
    System.out.print("Count to: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for (int i = 0; i <= n; i++) {
      System.out.print(i + " ");
    }
  }
}
