import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {

    String strInvertida = "";

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma string: ");
    String string = scanner.nextLine();

    // pega a ultima letra da string e coloca no inicio da string auxiliar
    for (int i = string.length() - 1; i >= 0; i--) {
        strInvertida += string.charAt(i);
    }

    System.out.println("String invertida: " + strInvertida);
  }
}