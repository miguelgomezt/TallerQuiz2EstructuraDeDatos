package parte3;

///Ejercicio 19: Encuentre un elemento pico en un arreglo (mayor que sus vecinos).
/// Entrada: [1,3,5,4,2]
/// Salida: 5

public class Punto19 {
    public static int mayorNumero(int[] num, int inicio, int fin){
        if(inicio == fin){
            return num[inicio];
        }
        int medio = (inicio + fin)/2;
        if(num[medio]<num[medio+1]){
            ///Hacia la derecha porque el inicio es medio+1
            return mayorNumero(num, medio+1, fin);
        }else{
            /// Hacia la izquierda, por eso el fin es medio
            return mayorNumero(num, inicio, medio);
        }
    }

    public static void main(String[] args) {
        int[] num = {1,3,5,4,2};
        int resultado = mayorNumero(num, 0, num.length-1);
        System.out.println(resultado);
    }
}
