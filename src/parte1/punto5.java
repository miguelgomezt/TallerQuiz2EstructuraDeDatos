package parte1;

/// Ejercicio 5: Encuentre el valor máximo en un arreglo usando recursión.
/// Entrada: [3,7,2,9,1]
/// Salida: 9

public class punto5 {
    public static int mayorNumero(int[] nums, int index){
        if(index == nums.length-1){
            return nums[index];
        }
        int maxNums = mayorNumero(nums, index +1);
        if(nums[index] > maxNums){
            return nums[index];
        }else{
            return maxNums;
        }
    }

    public static void main(String[] args) {
        int [] nums = {3,7,2,9,1};
                int resultado = mayorNumero(nums, 0);
        System.out.println(resultado);
    }
}
