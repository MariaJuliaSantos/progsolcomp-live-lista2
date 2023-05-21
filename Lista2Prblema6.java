// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema6
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema6 {

    public static void main(String[] args) {
        int nota;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota:");
        nota = teclado.nextInt();

        teclado.close();

        System.out.println("Conceito do aluno:");
        if(nota<=49) { 
                System.out.println("Insuficiente");
            }
            else if(nota>=50 && nota<=64){
                System.out.println("Regular");
            } 
            else if(nota>=65 && nota<=84){
                System.out.println("Bom");
            }
            else if(nota>=85 && nota<=100){
                System.out.println("Ótimo");
            }
            else {
                System.out.println("Nota fora do limite");
            }
        }
            
    }

