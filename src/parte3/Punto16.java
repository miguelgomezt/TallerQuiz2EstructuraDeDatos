package parte3;

///Ejercicio 16: Encuentre el último elemento menor o igual a x en un arreglo ordenado.
/// Entrada: [1,3,5,7], x=6
/// Salida: 5

public class Punto16 {
    public static int encontrarNumero(int[] nums, int inicio, int fin, int valor, int resultado){
        if(inicio > fin){
            return resultado;
        }
        int medio = (inicio+fin)/2;

        if(nums[medio] <= valor){
            resultado = nums[medio];

            ///Miramos a la derecha del vector
            return encontrarNumero(nums, medio+1, fin, valor, resultado);
        }else {
            ///Miramos a la izquierda del vector
            return encontrarNumero(nums, inicio, medio-1, valor, resultado);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        int valor = 6;
        int resultado = encontrarNumero(nums, 0, nums.length-1, valor, 0);
        System.out.println(resultado);
    }
}
