package parte2;
import java.util.Arrays;/// Modifique MergeSort para ubicar primero números negativos y luego positivos, ambos ordenados. Entrada: [3,-1,4,-2]. Salida:  [-2,-1,3,4]
public class Punto9 {
    public static void mergeSort(int[] arr, int inicio, int fin){
        if(inicio >= fin) return;
        int medio = (inicio+fin)/2;
        mergeSort(arr, inicio, medio);
        mergeSort(arr, medio+1, fin);
        merge(arr, inicio, medio, fin);
    }
    public static void merge(int[] arr, int inicio, int medio, int fin){
        int[] temp = new int[fin-inicio+1];
        int i = inicio;
        int j = medio+1;
        int k = 0;
        while(i<=medio && j<=fin){
            if(debeIrPrimero(arr[i], arr[j])){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while( i<=medio){
            temp[k++] = arr[i++];
        }
        while(j<=fin){
            temp[k++] = arr[j++];
        }
        for(int t = 0; t < temp.length; t++){
            arr[inicio+t] = temp[t];
        }
    }
    public static boolean debeIrPrimero(int a, int b) {
        if (a < 0 && b >= 0) {
            return true;
        }
        if(a >= 0 && b < 0) {
            return false;
        }
        return a < b;
    }
    public static void main(String[] args) {
        int[] arr = {3,-1,4,-2};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
