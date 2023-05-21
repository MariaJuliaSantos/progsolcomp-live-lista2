// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema4
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema4 {
    
    public static void main (String[] args) {

         int numero;

         Scanner teclado = new Scanner (System.in);

         System.out.println("Digite um número:");
         numero = teclado.nextInt();

         teclado.close();

         if (numero % 2 == 0 ) {

            System.out.println("O número é par.");

         }
         else {
            System.out.println("O número é impar.");
         }

         if (numero >= 0 ) {

            System.out.println("O número é positivo.");

         }

         else {
            System.out.println("O número é negativo.");
         }
        }
}