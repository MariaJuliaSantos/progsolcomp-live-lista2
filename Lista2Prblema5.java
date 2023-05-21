// Nome do Aluno: Maria Júlia Santos Aragão
// RA: 1352319161
// Nome do Programa: Lista2Prblema5
// Data: 21/05/23

import java.util.Scanner;

public class Lista2Prblema5 {

    public static void main(String[] args) {
        String nome, sobrenome, naturalidade, opcao; 
        int idade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        nome = teclado.next();
        System.out.println("Informe seu sobrenome:");
        sobrenome = teclado.next();
        System.out.println("Informe sua idade:");
        idade = teclado.nextInt();
        System.out.println("Informe sua naturalidade(Cidade de nascimento):");
        naturalidade = teclado.next();
        System.out.println("Deseja visualizar dados completos? [S/N]");
        opcao = teclado.next();

        teclado.close();

        if(opcao.equals("S")) {
        System.out.println("Dados completos:");
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        System.out.println(naturalidade);
        } 
        else if(opcao.equals("N")){
        System.out.println("Dados:");
        System.out.println(nome);
        System.out.println(idade);
        } 
        else {
        System.out.println("Digitação errada. Tente Novamente");
        }
    }

}