import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int num = scanner.nextInt();

    int a = 0;
    int b = 1;
    int c = a;

    while (c <= num) {
        if (c == num) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
            return;
        }
        a = b;
        b = c;
        c = a + b;
    }

    System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
    scanner.close();
  }
}
