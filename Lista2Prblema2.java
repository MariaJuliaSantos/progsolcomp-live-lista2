// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema2
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema2 {

    public static void main(String[] args) {
        int a, b ,c;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite três números");

        System.out.println("Digite o primeiro número:");
        a = teclado.nextInt();

        System.out.println("Digite o segundo número:");
        b = teclado.nextInt();

        System.out.println("Digite o terceiro número:");
        c = teclado.nextInt();

        System.out.println("Números em ordem crescente:");

        if(a<b) { 
            if(b<c){
                System.out.println(""+a+","+b+","+c+"");
            }
            else if(a<c){
                System.out.println(""+a+","+c+","+b+"");
            } else {
                System.out.println(""+c+","+a+","+b+"");
            }
        }
        else if(b<c) { 
            if(a<c){
                System.out.println(""+b+","+a+","+c+"");
            } else {
                System.out.println(""+b+","+c+","+a+"");
            }

        } else { 
                System.out.println(""+c+","+b+","+a+"");
            }
        }
            
    }

