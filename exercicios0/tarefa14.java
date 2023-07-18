package javaexercises.exercicios0;
public class tarefa14 {
    
    public static void main(String[] args) {
        //14. Faça um programa que utilize a estrutura while para ler 50 números e calcule 
        //e exiba a média aritmética deles. 
        //(Pesquise sobre como realizar entrada de dados)

        int i = 1;
        double soma = 0;
        double media = 0;

        while (i <= 50) {
            soma += i;
            i++;
        }
        media = soma / 50;
        System.out.println("A média aritmética é: " + media);
    }
}
