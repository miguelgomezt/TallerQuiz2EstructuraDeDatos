package parte2;

import java.util.Arrays;

///Reorganice un arreglo para que los números pares queden al inicio y los impares al final, sin ordenar completamente. Entrada: [3,2,7,4,1] Salida: [2,4,3,7,1]
public class Punto13 {
    public static void reordenar(int[] arr) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio < fin) {
            if (arr[inicio] % 2 == 0) {
                inicio++;
            } else if (arr[fin] % 2 != 0) {
                fin--;
            } else {
                int temp = arr[inicio];
                arr[inicio] = arr[fin];
                arr[fin] = temp;
                inicio++;
                fin--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,7,4,1};
        reordenar(arr);
        System.out.println(Arrays.toString(arr));
    }
}
