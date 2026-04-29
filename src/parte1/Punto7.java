package parte1;

import java.util.ArrayList;
import java.util.List;

public class Punto7{
    public static void permutaciones(String texto, String actual, boolean[] usado, List<Integer> resultado){
        if(actual.length() == texto.length()){
            resultado.add(actual.length());
            return;
        }
        /// Recorremos el texto completo
        for(int i = 0; i < texto.length(); i++){
            ///  Si ya fue usado lo saltamos
            if(usado[i]) continue;

            /// Elegimos el caracter
            usado[i] = true;
            /// Lo agregamos
            permutaciones(texto, actual + texto.charAt(i), usado, resultado);

            /// BackTracking: Lo desmarcamos
            usado[i] = false;
            }
        }

    public static void main(String[] args) {
        String texto = "ab";
        List<Integer> resultado = new ArrayList<>();
        boolean[] usado = new boolean[texto.length()];

        permutaciones(texto, "",  usado, resultado);
        System.out.println(resultado);


    }
}

