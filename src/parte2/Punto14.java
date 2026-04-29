package parte2;
import java.util.Arrays;
///Ordene cada fila de una matriz usando un algoritmo de ordenamiento.Entrada:[[3,1,2],[9,5,6]]Salida:[[1,2,3],[5,6,9]]
public class Punto14 {
    public static void bubbleSort(int[] fila){
        for(int i = 0; i < fila.length-1; i++){
            for(int j = 0; j < fila.length-1; j++){
                if(fila[j] > fila[j+1]){
                    int temp = fila[j];
                    fila[j] = fila[j+1];
                    fila[j+1] = temp;
                }
            }
        }
    }
    public static void ordenaFilas(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            bubbleSort(matriz[i]); /// Ordena fila manualmente
        }
    }
    public static void main(String[] args) {
        int[][] matriz = {
                {3,1,2},
                {9,5,6}
        };
        ordenaFilas(matriz);
        for(int[] fila: matriz)
        System.out.println(Arrays.toString(fila));
    }
}
