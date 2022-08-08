import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter two numbers: ");

    double first = reader.nextDouble();
    double second = reader.nextDouble();
    System.out.println("Enter an operator (+, -, *, /): ");
  }
}
