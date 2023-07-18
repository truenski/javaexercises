package javaexercises.exercicios0;

//7. Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma
//que a variável A passe a possuir o valor da variável B e que a variável B passe 
//a possuir o valor da variável A. Apresentar os valores trocados.


public class tarefa7 {
  public static void main(String[] args) {
    
    char a = 'a';
    char b = 'b';
    
    char temp = a;
    a = b;
    b = temp;

    System.out.println(a);
    System.out.println(b);


}

}