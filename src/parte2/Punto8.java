package parte2;
import java.util.Arrays;  ///Modifique QuickSort para ordenar un arreglo en orden descendente.Entrada: [3,1,4,2].Salida: [4,3,2,1
import java.util.Random;
public class Punto8 {
    private static final Random RAND = new Random();
    public static <T extends Comparable<T>> void quickSort(T[] arr) {
        // Llamamos al método recursivo con el rango completo
        ordenar(arr, 0, arr.length - 1);
    }
        private static <T extends Comparable<T>> void ordenar(T[] arr, int bajo, int alto){
            if(bajo >= alto) return;
            int pivoteAleatorio = bajo + RAND.nextInt(alto - bajo + 1);
            intercambiar(arr, pivoteAleatorio, alto);
            int posicionPivote = particionar(arr, bajo, alto);
            ordenar(arr, bajo, posicionPivote - 1);
            // Ordenamos recursivamente la mitad derecha (excluye el pivote)
            ordenar(arr, posicionPivote + 1, alto);
        }
    private static <T extends Comparable<T>> int particionar(T[] arr, int bajo, int alto){
        T pivote = arr[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (arr[j].compareTo(pivote) > 0) {
                i++;
                intercambiar(arr, i, j);
            }
        }
        intercambiar(arr, i + 1, alto);
        return i + 1;
    }
    private static <T> void intercambiar(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        Integer[] arr ={3,1,4,2};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));;
    }
}
