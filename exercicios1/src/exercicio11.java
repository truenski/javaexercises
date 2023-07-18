package javaexercises.exercicios1.src;
import java.util.Scanner;


public class exercicio11 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int tanquesCheios = 0;
            double quilometragemTotal = 0;
            double litrosTotal = 0;

            System.out.print("Quantos tanques cheios você deseja registrar? ");
            int numeroTanques = scanner.nextInt();

            for (int i = 1; i <= numeroTanques; i++) {
                System.out.print("Quilometragem dirigida no tanque " + i + ": ");
                int quilometragem = scanner.nextInt();

                System.out.print("Quantidade de litros de gasolina consumidos no tanque " + i + ": ");
                int litros = scanner.nextInt();

                double consumo = (double) quilometragem / litros;

                System.out.println("Consumo em quilômetros/litro no tanque " + i + ": " + consumo);

                tanquesCheios++;
                quilometragemTotal += quilometragem;
                litrosTotal += litros;
            }

            double consumoMedioGeral = quilometragemTotal / litrosTotal;

            System.out.println("\nQuilometragem combinada: " + quilometragemTotal);
            System.out.println("Soma total de litros de combustível consumidos: " + litrosTotal);
            System.out.println("Consumo médio geral em quilômetros/litro: " + consumoMedioGeral);

            scanner.close();

    }

}
