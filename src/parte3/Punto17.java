package parte3;

///Ejercicio 17: Determine si un valor existe en una matriz donde cada fila está ordenada.
/// Entrada: [[1,3,5],[7,9,11]], x=9
/// Salida: true

public class Punto17 {
    public static void main(String[] args) {
        int[][] m = {{1, 3, 5}, {7, 9, 11}};
        System.out.println(buscarEnMatriz(m, 9, 0)); // true
    }

    // Busca x en la matriz fila por fila usando búsqueda binaria en cada fila
    static boolean buscarEnMatriz(int[][] m, int x, int fila) {
        if (fila == m.length) return false; // CASO BASE: revisamos todas las filas

        // Búsqueda binaria en la fila actual
        boolean enEstaFila = buscarEnFila(m[fila], x, 0, m[fila].length - 1);
        if (enEstaFila) return true;

        // Si no está en esta fila, buscamos en la siguiente
        return buscarEnMatriz(m, x, fila + 1);
    }

    static boolean buscarEnFila(int[] fila, int x, int izq, int der) {
        if (izq > der) return false;
        int mid = izq + (der - izq) / 2;
        if (fila[mid] == x) return true;
        if (x < fila[mid]) return buscarEnFila(fila, x, izq, mid - 1);
        return buscarEnFila(fila, x, mid + 1, der);
    }
}

