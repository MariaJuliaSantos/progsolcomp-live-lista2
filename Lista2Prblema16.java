// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema16
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema16 {
    public static void main(String[] args) {
      int num;

        Scanner teclado = new Scanner (System.in);      

      do {
        System.out.println("Escreva um número menor que zero:");
        num = teclado.nextInt();
        
      } while (num >= 0);

        System.out.println("Obrigado.");

        teclado.close();
        }
       
    }
