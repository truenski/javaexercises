package javaexercises.exercicios1.src;
public class exercicio7 {

        public static void main(String[] args) {
            // Usando o tipo int
            System.out.println("Usando o tipo int:");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    int resultadoInt = i / 2;
                    System.out.println(i + " / 2 = " + resultadoInt);
                }
            }

            // Usando o tipo double
            System.out.println("\nUsando o tipo double:");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    double resultadoDouble = (double) i / 2;
                    System.out.println(i + " / 2 = " + resultadoDouble);
                }
            }

    }

}
