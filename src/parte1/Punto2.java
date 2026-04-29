package parte1;

///  Ejercicio 2: Dada una matriz de tamaño n x m, calcule recursivamente el número total de caminos
/// desde la esquina superior izquierda hasta la inferior derecha, moviéndose solo hacia abajo o
/// derecha.
/// Entrada: n=2, m=2
/// Salida: 2

public class Punto2 {
    public static int calcularCaminos(int n, int m, int i, int j){
        /// Caso 1, si llegamos al destino
        if(i == n-1 || j == n-1){
            return 1;
        }
        ///  Caso 2, no llegamos al destino   ///NOTA IMPORTANTE: Ir hacia la derecha (i,j+1) Ir hacia abajo (i+1, j)
        if(i>=n || j>=m){
            return 0;
        }
        /// Movimiento hacia la derecha
        int derecha = calcularCaminos(n, m, i, j+1);
        /// Movimiento hacia la derecha
        int abajo = calcularCaminos(n,m,i+1,j);

        /// Sumamos los caminos
        int caminosTotales = derecha + abajo;
        return caminosTotales;
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 2;

        int resultado = calcularCaminos(n,m,0,0);
        System.out.println("Resultado: " + resultado);
    }
}
