package exercicios1;
public class tarefa13 {
    public static void main(String[] args) {
        //13. Escreva uma classe que imprima todas as possibilidades de que 
        //no  lançamento de dois dados tenhamos o valor 7 como resultado da soma
        // dos valores de cada dado.
        
        for( int i = 1; i <= 6; i++){
            for( int j = 1; j <= 6; j++){
                if(i + j == 7){
                    System.out.println(i + " + " + j + " = 7");
                }
            }
        }

    }
}
