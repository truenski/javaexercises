package javaexercises.exercicios0;

import java.util.Scanner;

// JIT: just in time compiler
// Executa em pontos quentes da aplicação, levando o código a compilar em
// instruções nativas,
// tendo em vista melhorar a performance do app

// • JVM = apenas a virtual machine, esse download não existe, ela sempre vem
// acompanhada.
// • JRE = Java Runtime Environment, ambiente de execução Java, formado pela JVM
// e bibliotecas, tudo
// que você precisa para executar uma aplicação Java. Mas nós precisamos de
// mais.

// • JDK = Java Development Kit: Nós, desenvolvedores, faremos o download do JDK
// do Java SE (Stan-
// dard Edition). Ele é formado pela JRE somado a ferramentas, como o
// compilador.

// java test.java - faz rodar
// no java não tem 3 iguais ===
//sequencia de cyracuse ???
// pra pegar valor de input no python não precisa importar
// atributo public obriga a classe a ser definida num arquivo com o proprio nome da classe
//main é o metodo(?) que ...??? só pode ter um método main
//reaprendendo POO syntax sugar.
//tipos primitivos(integer,long(long integer useL),float use F,double)
//byte(-128,127),short(-32,768-32,768)
//char = ''
//int = ""
//para que serve .javac
//final double x = ... (final === constante)

//aprender classes api padrão

class ConjecturaDeCollatz {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite um Número");

        int x = myObj.nextInt();
        // eventualmente, sempre chegará ao número 1
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            System.out.println(x);
        }

    }

}

class ConjecturaDeCollatzRecursiva {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite um Número");

        int x = myObj.nextInt();
        collatz(x);

        myObj.close();
    }

    public static void collatz(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.println(n);
            boolean isEven = n % 2 == 0;
            if (isEven) {
                collatz(n / 2);
            } else {
                collatz(3 * n + 1);
            }
        }
    }

}
// Risco de estouro de pilha: A versão recursiva uma mais memória.
// Se você tiver uma longa cadeia na sequência de Collatz,
// a versão recursiva pode levar a um estouro de pilha (erro stackoverflow),
// onde ocorre um erro porque você excedeu a quantidade de espaço alocado
// pela sua JVM para a pilha de chamada.

// Dado uma variável x com valor 13, faça um
// programa que transforme x da seguinte forma:
// se x é par, y=x/2
// se x é impar, y=3*x+1
// imprime y
// neste ponto o programa deve então jogar O valor de y em X
// e começar tudo de novo enquanto y seja diferente de 1.
