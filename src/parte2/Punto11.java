package parte2;
import java.util.Arrays;
///Ejercicio 11: Modifique QuickSort para ordenar elementos según su distancia absoluta a un valor dado x. Entrada:[10,5,3,9] x=7 Salida:[5,9,10,3]
public class Punto11 {
    public static void quickSort(int[] arr, int inicio, int fin, int valor) {
        if (inicio < fin) {
            int pivoteIndex = particion(arr, inicio, fin, valor);
            quickSort(arr, inicio, pivoteIndex - 1, valor);
            quickSort(arr, pivoteIndex + 1, fin, valor);
        }
    }
    public static int particion(int[] arr, int inicio, int fin, int valor) {
        int pivote = arr[inicio];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (Math.abs(arr[j] - valor) < Math.abs(pivote - valor)) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,3,9};
        int valor = 7;
        quickSort(arr, 0, arr.length-1, valor);
        System.out.println(Arrays.toString(arr));
    }
}
