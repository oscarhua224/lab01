package num1;

public class Arreglo {

	public static int sumarArreglo(int[] arr) {
		// TODO Auto-generated method stub
		int suma=0;
		for (int elemento:arr) {
			suma+=elemento;
		}
		return suma;
	}
	public static void main(String[] args) {
	    int[] numeros = {1,2,3,4,5};
	    System.out.println(sumarArreglo(numeros));
		}
	}
	