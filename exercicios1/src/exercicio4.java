import java.util.Scanner;

public class exercicio4 {
    //4. Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas,
    // converte-a para quilômetros e apresenta o resultado no console. (fórmula de conversão: 1 milha = 1.609 km).


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a distância em milhas: ");
            double milhas = scanner.nextDouble();

            double quilometros = milhasParaQuilometros(milhas);
            System.out.println(milhas + " milhas é igual a " + quilometros + " quilômetros.");

            scanner.close();
        }

        private static double milhasParaQuilometros(double milhas) {
            return milhas * 1.609;
        }

}
