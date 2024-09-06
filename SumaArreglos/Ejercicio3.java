package SumaArreglos;

public class Ejercicio3 {

	public static void main(String[] args) {
	    int[] array1 = {10, 20, 30};
        int[] array2 = {1, 2, 3};
        int[] sumArray = new int[array1.length];
        int totalSum = 0;

        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
            totalSum += sumArray[i];
        }

        System.out.print("Arreglo resultante: ");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + " ");
        }
        System.out.println();
        System.out.println("Suma total de los elementos del arreglo resultante: " + totalSum);
	}

}
