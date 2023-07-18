public class exercicio6 {
    public static void main(String[] args) {
        int produtoInt = 1;
        float produtoFloat = 1.0f;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) { // Verifica se o número é ímpar
                produtoInt *= i;

                produtoFloat *= i;
                System.out.println(produtoFloat);

            }
        }

        System.out.println("Produto dos números ímpares (usando int): " + produtoInt);
        System.out.println("Produto dos números ímpares (usando float): " + produtoFloat);
    }
}
