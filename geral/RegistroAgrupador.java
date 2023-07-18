package javaexercises.geral;
import java.util.HashMap;
import java.util.Map;

public class RegistroAgrupador {

   

    public static Map<String, Integer> agrupar(Object[] registros) {
        Map<String, Integer> dadosAgrupados = new HashMap<>();

        for (Object registroObj : registros) {
            // Converter o objeto de registro para um mapa
            Map<String, Object> registro = (Map<String, Object>) registroObj;
            
            // Obter a data do registro
            String data = (String) registro.get("data");
            
            // Obter a quantidade do registro, verificando se é "qtd" ou "atd"
            Integer quantidade = (Integer) registro.getOrDefault("qtd", registro.get("atd"));

            // Verificar se tanto a data quanto a quantidade são não nulas
            if (data != null && quantidade != null) {
                // Adicionar a quantidade à chave de data existente ou criar uma nova chave
                dadosAgrupados.put(data, dadosAgrupados.getOrDefault(data, 0) + quantidade);
            }
        }

        return dadosAgrupados;
    }
}
