import java.net.SocketPermission;

public class Q1 {
  public static void main(String[] args) {
    int INDICE = 13;
    int SOMA = 0;
    int K = 0;
    for (; K < INDICE;) {
      K += 1;
      SOMA = SOMA + K;
    }
    System.out.println(SOMA);
  }
}
