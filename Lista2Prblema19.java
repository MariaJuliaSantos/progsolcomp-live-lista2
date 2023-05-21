// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema19
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema19 {
    public static void main(String[] args) {

        int tempo = 0;
        int vol;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Defina o volume em centímetros cúbicos:");
        vol = teclado.nextInt();

       while( vol <= 1000) {
            
            vol *= 2;
            tempo ++;
        } 

       System.out.println("O volume chegou a 1000 centímetros cúbicos em:" + tempo + "segundos.");

       teclado.close();

        }
    }
