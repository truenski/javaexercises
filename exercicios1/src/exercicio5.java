import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        //5. Faça um programa que solicite ao usuário um número de 1 a 7,
        // e imprima na tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 , Terça corresponde a 2, e assim por diante. Utilizando Array.



                String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

                Scanner scanner = new Scanner(System.in);


                int numero = 0;
                do {
                    System.out.print("Digite um número de 1 a 7: ");
                     numero = scanner.nextInt();
                    if (numero >= 1 && numero <= 7) {
                        String diaCorrespondente = diasDaSemana[numero - 1];
                        System.out.println("Dia da semana correspondente: " + diaCorrespondente);
                    } else {
                        System.out.println("Número inválido. Digite um número de 1 a 7.");
                    }
                }while(numero <= 1 || numero >= 7);



                scanner.close();

    }

}
