// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema7
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema7 {
 
    public static void main(String[] args) {

        double diaria;
        double taxa;
        double valordiaria;
        double valorfinal;
        

        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite o número de diárias:");
        diaria = teclado.nextDouble();

        teclado.close();

        valordiaria = 60.00;
        taxa = 0;

        if (diaria > 15) {
            taxa = 5.50;
        }

        else if (diaria == 15) {
            taxa = 6.00;
        }

        else if (diaria < 15) {
            taxa = 8.00;
        }

        valorfinal = diaria * (valordiaria + taxa);

        System.out.println("O valor final será de:" + valorfinal);

    }
}