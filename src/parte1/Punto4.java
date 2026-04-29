package parte1;

///  Ejercicio 4: Verifique recursivamente si una cadena tiene paréntesis correctamente balanceados.
/// Entrada: '(())()'
/// Salida: true
///

public class Punto4 {
    public static boolean parentesis(String cadena, int index, int contador){
        if(contador<0){
            return false;
        }
        if(index== cadena.length()){
            return contador == 0;
        }

        char c =  cadena.charAt(index);
        if(c=='('){
            /// Aumentar el contador
            return parentesis(cadena, index+1, contador+1);
        }else if(c==')'){
            /// Restamos al contador
            return parentesis(cadena, index+1, contador-1);
        }else{
            /// Ignoramos otros caracteres por si acaso
            return parentesis(cadena, index+1, contador);
        }
    }

    public static void main(String[] args) {
        String cadena = "(())()";
        boolean resultado = parentesis(cadena, 0, 0);
        System.out.println(resultado);
    }
}
