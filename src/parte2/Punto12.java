package parte2;
import java.util.Arrays;
/// Ordene un arreglo de cadenas por longitud usando MergeSort.Entrada: ['a','abc','ab'] Salida: ['a','ab','abc']
public class Punto12 {
    public static void mergeSort(String[] arr, int inicio, int fin){
        if(inicio>=fin)return;
            int medio =  (inicio+fin)/2;
            mergeSort(arr,inicio,medio);
            mergeSort(arr,medio+1,fin);
            merge(arr,inicio,medio,fin);
    }
    public static void merge(String[] arr, int inicio, int medio, int fin){
        String[] temp= new String[fin-inicio+1];
        int i = inicio;
        int j = medio+1;
        int k = 0;
        while(i<=medio && j<=fin){
            if(arr[i].length()<=arr[j].length()){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while( i<=medio){
            temp[k++] = arr[i++];
        }
        while(j<= fin){
            temp[k++] = arr[j++];
        }
        for(int t = 0; t < temp.length; t++ ){
            arr[inicio+t] = temp[t];
        }
    }
    public static void main(String[] args) {
        String[] arr = {"a" , "abc", "ab"};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
