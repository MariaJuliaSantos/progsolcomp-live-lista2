// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema12
// Data: 21/05/23

public class Lista2Prblema12 {
    
  public static void main(String[] args) {
      int numero = 0;

      do {
          if (numero % 2 == 0) {
              System.out.println(numero);
          }
          numero++;
      } while (numero % 7 != 0);
  }
}
