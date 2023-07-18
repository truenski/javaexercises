package javaexercises.ProgramaBanco;


    public class Cliente {

    private String nome;
    private String endereco;
    private String anoNascimento;
    private String cpf;

    public Cliente (String cpf, String nome, String endereco, String anoNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.anoNascimento = anoNascimento;
        }

        public String getNome() {
            return nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public String getAnoNascimento() {
            return anoNascimento;
        }

        public String getCpf() {
            return cpf;
        }

}
// ContaCorrente
// Atributos:
// String numero, String tipo, Cliente primeiroTitular, Cliente
// segundoTitular,double saldo, double limiteTotal
// Métodos
// credito(double valor) - aumenta o saldo com o valor informado.
// debito(double valor) - diminui o saldo com o valor informado.
// resumo() - Imprime na tela:
// Numero da Conta Corrente
// Nome do primeiro titular
// Nome do segundo titular (se existir)
// Saldo Atual
// Limite Atual (limite total + saldo atual)
// Limite Total
// Se estiver devedor mostrar no final do resumo a mensagem: "Procure o seu
// gerente!"
// estaDevedor() - retorna true se o saldo for menor que zero, retorna false se
// o saldo for maior ou igual a zero

// Cliente
// Atributos:
// String cpf, String nome, String endereco, String anoNascimento

// Na classe ProgramaBanco.java (com main), crie uma conta corrente, atualize
// todos os atributos obrigatórios, faça alguns créditos e alguns débitos e
// depois imprima o resumo da conta corrente.

