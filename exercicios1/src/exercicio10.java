package javaexercises.exercicios1.src;
public class exercicio10 {

        public static void main(String[] args) {
            String cadeia = "Olá, Mundo!"; // Substitua essa string pela cadeia de caracteres que você deseja verificar

            int vogais = contarVogais(cadeia);
            int espacos = contarEspacos(cadeia);
            int consoantes = contarConsoantes(cadeia);

            System.out.println("Quantidade de vogais: " + vogais);
            System.out.println("Quantidade de espaços em branco: " + espacos);
            System.out.println("Quantidade de consoantes: " + consoantes);
        }

        private static int contarVogais(String cadeia) {
            int count = 0;
            for (char c : cadeia.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        }

        private static int contarEspacos(String cadeia) {
            int count = 0;
            for (char c : cadeia.toCharArray()) {
                if (c == ' ') {
                    count++;
                }
            }
            return count;
        }

        private static int contarConsoantes(String cadeia) {
            int count = 0;
            for (char c : cadeia.toLowerCase().toCharArray()) {
                if (Character.isLetter(c) && !isVogal(c)) {
                    count++;
                }
            }
            return count;
        }

        private static boolean isVogal(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }


}
