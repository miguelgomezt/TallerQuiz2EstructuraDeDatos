package parte1;

///  Ejercicio 1: Dada una cadena que contiene letras y números, construya un método recursivo que
/// extraiga todos los números completos (no dígitos individuales) y retorne la suma total.
/// Entrada: '12abc34x5'
/// Salida: 51

public class Punto1 {
    public static int sumaNumerosCadena(String cadena, int index, int numeroActual, int sumaAcumulada){
        if(index == cadena.length()){
            return sumaAcumulada + numeroActual;
        }
        char c = cadena.charAt(index);

        if(Character.isDigit(c)){
            int nuevoNumero = numeroActual * 10 + (c - '0');
            return sumaNumerosCadena(cadena, index + 1, nuevoNumero, sumaAcumulada);
        }else{
            return sumaNumerosCadena(cadena, index +1, 0, sumaAcumulada + numeroActual);
        }
    }

    public static void main(String[] args) {
        String cadena = "12abc34x5";
        int resultado = sumaNumerosCadena(cadena, 0, 0, 0);
        System.out.println("Resultado: " + resultado);
    }
}
