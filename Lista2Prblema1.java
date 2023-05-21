// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema1
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema1 {

    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        numero1 = teclado.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = teclado.nextInt();

        teclado.close();

        if (numero1>numero2) {
            System.out.println("O maior número entre eles é:["+numero1+"]");
        } else {  System.out.println("O maior número entre eles é:["+numero2+"]");
        }
    }

}