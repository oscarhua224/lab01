package num1;
import java.util.Scanner;
public class ArrUnidimension {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros= new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<numeros.length;i++) {
			boolean valido=false;
			while(!valido) {
				System.out.print("Ingrese un numero "+(i+1)+":");
				int num=sc.nextInt();
				if (i==0) {
					numeros[i]=num;
					valido=true;
				}	else if (num>numeros[i-1]) {
					numeros[i]=num;
					valido=true;
				}	else {
					System.out.println("El numero debe ser mayor que "+numeros[i-1]);
				}
			}
		}
		System.out.println("Valor ingresado correctamente");
		for (int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]+"");
		}
		sc.close();
	}
}