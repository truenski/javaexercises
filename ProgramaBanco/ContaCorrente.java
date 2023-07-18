package javaexercises.ProgramaBanco;

public class ContaCorrente {
    private String numero;
    private String tipo;
    private Cliente primeiroTitular;
    private Cliente segundoTitular;
    private double saldo;
    private double limiteTotal;

    public ContaCorrente(String numero, String tipo, Cliente primeiroTitular, Cliente segundoTitular,
                         double saldo, double limiteTotal) {
        this.numero = numero;
        this.tipo = tipo;
        this.primeiroTitular = primeiroTitular;
        this.segundoTitular = segundoTitular;
        this.saldo = saldo;
        this.limiteTotal = limiteTotal;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public void resumo() {
        System.out.println("Número da Conta Corrente: " + numero);
        System.out.println("Nome do primeiro titular: " + primeiroTitular.getNome());
        if (segundoTitular != null) {
            System.out.println("Nome do segundo titular: " + segundoTitular.getNome());
        }
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("Limite Atual (limite total + saldo atual): " + (limiteTotal + saldo));
        System.out.println("Limite Total: " + limiteTotal);
        if (estaDevedor()) {
            System.out.println("Procure o seu gerente!");
        }
    }

    public boolean estaDevedor() {
        return saldo < 0;
    }

}

