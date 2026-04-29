package parte1;
import java.util.ArrayList;
import java.util.List;

/// Ejercicio 3: Genere todos los subconjuntos posibles de un arreglo utilizando recursión.
/// Entrada: [1,2]
/// Salida: [], [1], [2], [1,2]

public class Punto3 {
    public static void subConjuntos(int[] nums, int index, List<Integer> actual,
                                    List<List<Integer>> resultado){
        /// Llegamos hasta el final del arreglo
        if(index == nums.length){
            resultado.add(new ArrayList<>(actual));
            return;
        }
        actual.add(nums[index]);
        subConjuntos(nums, index+1, actual, resultado);

        /// Hacemos el BackTrack, quitamos uno
        actual.remove(actual.size()-1);
        subConjuntos(nums, index+1, actual, resultado);
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        List<List<Integer>> resultado = new ArrayList<>();

        subConjuntos(nums, 0, new ArrayList<>(), resultado);
        System.out.println(resultado);
    }
}
