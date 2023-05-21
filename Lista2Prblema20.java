// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema20
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema20 {
    public static void main(String[] args) {
        
        int contador = 0;
        int pessoas = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o peso máximo do elevador:");
        int cargamax = sc.nextInt();

        System.out.println("Digite a quantidade máxima de pessoas:");
        int maxpessoas = sc.nextInt();


        do {
            System.out.println("Digite o peso de cada pessoa:");
            double peso = sc.nextDouble();
            contador += peso;
            pessoas++;
                 
            
        } while(pessoas < maxpessoas && contador <= cargamax);
    sc.close();

    if (pessoas >= maxpessoas) {

        System.out.println("O máximo de pessoas foi atingido.");
    }


     else if (contador >= cargamax) {
        System.out.println("O peso máximo foi atingido.");
    }

    }
}