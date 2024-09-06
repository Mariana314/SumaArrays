package SumaArreglos;

public class Ejercicio2 {

	public static void main(String[] args) {
		  int[] array1 = {1, 2, 3};
	        int[] array2 = {4, 5, 6};
	        int[] sumArray = new int[array1.length];

	        for (int i = 0; i < array1.length; i++) {
	            sumArray[i] = array1[i] + array2[i];
	        }

	        System.out.print("Arreglo resultante: ");
	        for (int i = 0; i < sumArray.length; i++) {
	            System.out.print(sumArray[i] + " ");
	        }
	        System.out.println();
	}

}
