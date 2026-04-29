package parte2;

public class OrdenarArregloBubbleSort {
    public static void organizarVector(int[] vector){
            for(int i = 0; i < vector.length-1; i++){
                for(int j = 0; j < vector.length-i-1; j++){
                    if(vector[j] > vector[j+1]){
                        int temp = vector[j];
                        vector[j] = vector[j+1];
                        vector[j+1] = temp;

                    }
                }
            }
    }

    public static void main(String[] args) {
        int[] vactor = {5, 2, 8, 1, 3};
        organizarVector(vactor);

        for(int num : vactor){
            System.out.println(num);
        }
    }
}
