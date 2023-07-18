package javaexercises.exercicios1.src;
public class exercicio8 {
    public static boolean isPalindromo(String palavra) {
        int tamanho = palavra.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String palavra = "arara"; // Substitua essa string pela palavra que você quer verificar

        if (isPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
}
