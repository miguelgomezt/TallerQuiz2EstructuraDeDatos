package parte3;

///Ejercicio 15: Encuentre el primer elemento mayor o igual a x en un arreglo ordenado.
/// Entrada: [1,3,5,7], x=4
/// Salida: 5

public class Punto15 {
    public static int encontrarNumero(int[] nums, int inicio, int fin, int valor, int resultado) {
        if (inicio > fin) {
            return resultado;
        }
        /// Calculamos el indice medio
        int medio = (inicio + fin) / 2;

        if (nums[medio] >= valor) {
            resultado = nums[medio];
            return encontrarNumero(nums, inicio, medio-1, valor, resultado);
        } else {
            return encontrarNumero(nums, medio + 1, fin, valor, resultado);
        }
    }
    public static void main(String[] args) {
        int[] numns = {1,3,5,7};
        int resultado = encontrarNumero(numns, 0, numns.length, 4, 0);
        System.out.println(resultado);
    }
}
