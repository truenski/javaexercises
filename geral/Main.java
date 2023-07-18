package geral;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> registro1 = Map.of("data", "2023-07-13", "qtd", 12);
        Map<String, Object> registro2 = Map.of("data", "2023-07-14", "qtd", 30);
        Map<String, Object> registro3 = Map.of("data", "2023-07-15", "qtd", 74);

        Map<String, Integer> resultado = RegistroAgrupador.agrupar(new Object[] { registro1, registro2, registro3 });
        System.out.println(resultado);
    }
}

