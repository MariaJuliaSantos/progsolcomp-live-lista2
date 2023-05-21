// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema21
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = teclado.nextInt();

        teclado.close();

        if (numero <= 0) {
            System.out.println("O número digitado não é válido.");
            return;
        }

        for (int i = 1; i <= numero; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
        }
    }
}