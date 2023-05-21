// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema8
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema8 {

    public static void main(String[] args) {
        int mes;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("DIgite o número do mês:(1/12)");
        mes = teclado.nextInt();

        teclado.close();

        System.out.println("Mês e estação:");
        if(mes==1) { 
                System.out.println("Janaeiro;");
            }
            else if(mes==2){
                System.out.println("Fevereiro;");
            } 
            else if(mes==3){
                System.out.println("Março;");
            } 
            else if(mes==4){
                System.out.println("Abril;");
            } 
            else if(mes==5){
                System.out.println("Maio;");
            } 
            else if(mes==6){
                System.out.println("Junho;");
            } 
            else if(mes==7){
                System.out.println("Julho;");
            } 
            else if(mes==8){
                System.out.println("Agosto;");
            } 
            else if(mes==9){
                System.out.println("Setembro;");
            } 
            else if(mes==10){
                System.out.println("Outubro;");
            } 
            else if(mes==11){
                System.out.println("Janeiro;");
            } 
            else {
                System.out.println("Dezembro;");
            } 
        

            if(mes==1 && mes<=3) { 
                System.out.println("Verão;");
            }
            else if(mes==4 && mes<=6){
                System.out.println("Outono;");
            } 
            else if(mes==7 && mes<=9){
                System.out.println("Iverno;");
            } 
            else {
                System.out.println("Primavera;");
            } 
        }
            
    }

