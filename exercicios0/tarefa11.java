package javaexercises.exercicios0;
import java.util.Scanner;

public class tarefa11 {
    public static void main(String[] args) {
        
//11. Utilize a estrutura if para fazer um programa que retorne o nome de um
//produto a partir do código do mesmo. Considere os seguintes códigos:

//001 ? Parafuso;
//002 ? Porca;
//003 ? Prego;

//Para qualquer outro código: XXX ? Diversos.

        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Digite 001, 002, 003 ou qualquer outro");

            int codigo = myObj.nextInt();

            if (codigo == 001) {
                System.out.println("Parafuso");
            } else if (codigo == 002) {
            System.out.println("Porca");
            } else if (codigo == 003) {
                System.out.println("Prego");
            }else{
                System.out.println("Diversos");
            }
        } 



    }
}
