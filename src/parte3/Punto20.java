package parte3;
///Ejercicio 20: Busque un elemento en un arreglo ordenado y rotado usando búsqueda binaria.
/// Entrada: [15,18,2,3,6,12], x=3
/// Salida: índice 3
public class Punto20 {
    public static int busquedaElemento(int[] num, int inicio, int fin, int valor) {
        if (inicio > fin) {
            return -1;
        }
        int medio = (inicio + fin) / 2;
        ///Si encontramos el valor
        if (num[medio] == valor) {
            return medio;
        }
        ///Si la mitad de la parte izquierda esta ordenada
        if (num[inicio] <= num[medio]) {
            if (valor >= num[inicio] && valor < num[medio]) {
                return busquedaElemento(num, inicio, medio - 1, valor);
            } else {
                return busquedaElemento(num, medio + 1, fin, valor);
            }
        } else {
            ///La mita derecha esta ordenada
                if (valor >= num[medio] && valor < num[fin]) {
                    return busquedaElemento(num, medio + 1, fin, valor);
                } else {
                    return busquedaElemento(num, inicio, medio - 1, valor);
                }
            }
        }
    public static void main(String[] args) {
        int[] num = {15,18,2,3,6,12};
        int valor = 3;
        int resultado = busquedaElemento(num, 0, num.length - 1, valor);
        System.out.println(resultado);
    }
}

