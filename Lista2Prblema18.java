// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema18
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema18 {
    public static void main(String[] args) {
        int fatorial = 1;
        
        System.out.print("Digite um número para seu fatorial ser calculado: ");
        Scanner teclado = new Scanner(System.in);        
        int numero = teclado.nextInt();

        teclado.close();
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}