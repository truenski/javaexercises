package javaexercises.exercicios1.src;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        //Crie uma classe e na função main() implemente um
        // programa que lê um número inteiro do teclado e imprime todos os números primos menores que ele (divisíveis por 1 ou por ele mesmo).
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        ArrayList<Integer> result = getPrimos(numero);
        if(result.isEmpty())
            System.out.println("Não há primos menores que " + numero);
        else
            System.out.println("Os némeros primos menores que " + numero + " são: " + result);


    }
    private static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<Integer> getPrimos(int num) {
        ArrayList<Integer> primosList = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            if (isPrimo(i)) {
                primosList.add(i);
            }
        }
        return primosList;
    }

}
