package parte1;

/// Ejercicio 6: Cuente cuántas veces aparece un valor en una matriz usando recursión.
/// Entrada: [[1,2,3],[2,2,4]], x=2
/// Salida: 3

public class punto6 {
    public static int apariciones(int matriz[][], int n, int m, int valor){
        if(n == matriz.length){
            return 0;
        }
        /// Llegar al final de una fila para pasar al la siguiente
        if(m == matriz[n].length){
            return apariciones(matriz,n+1,m,valor);
        }
        /// Contamos si el elemento actual es igual a x
        int contador = matriz[n][m] == valor ? 1 : 0;
        return contador + apariciones(matriz,n,m+1,valor);
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {2,2,4}
        };
        int valor = 2;
        int resultado = apariciones(matriz, 0,0,valor);
        System.out.println("Resultado: " + resultado);
    }
}
