// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema3
// Data: 21/05/23

import java.util.Scanner;
public class Lista2Prblema3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = teclado.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}
