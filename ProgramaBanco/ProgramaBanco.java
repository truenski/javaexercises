package javaexercises.ProgramaBanco;

public class ProgramaBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("111.111.111-11", "João da Silva", "Rua A, 123", "1990");
        Cliente cliente2 = new Cliente("222.222.222-22", "Maria Souza", "Avenida B, 456", "1985");

        ContaCorrente conta = new ContaCorrente("12345-6", "???", cliente1, cliente2, 1000.0, 2000.0);

        conta.creditar(500.0);
        conta.debitar(200.0);
        conta.debitar(1500.0);

        conta.resumo();
    }
}
