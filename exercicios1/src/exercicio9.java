package javaexercises.exercicios1.src;
import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = calcularAreaCirculo(raio);

        System.out.println("A área do círculo é: " + Math.round(area));

        scanner.close();
    }

    private static double calcularAreaCirculo(double raio) {
        final double PI = 3.14159;
        return PI * Math.pow(raio, 2);
    }
}
