package parte3;

///Ejercicio 18: Calcule la raíz cuadrada entera de un número usando búsqueda binaria.
/// Entrada: 16
/// Salida: 4

public class Punto18 {
    public static int resultadoCuadrado(int numero, int inicio, int fin, int resultado) {
        if (inicio > fin) {
            return resultado;
        }
        int medio = (inicio + fin) / 2;
        int cuadrado = medio * medio;

        if (cuadrado == resultado) {
            return medio;
        } else if (cuadrado < resultado) {

            resultado = medio;
            return resultadoCuadrado(numero, medio + 1, fin, resultado);
        }else{
            return resultadoCuadrado(numero, medio-1, fin, resultado);
        }
    }

    public static void main(String[] args) {
        int numero = 16;
        int resultado = resultadoCuadrado(numero, 0, 0, 0);
        System.out.println(resultado);
    }
}
