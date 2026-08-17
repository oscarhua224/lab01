package num1;
import java.util.Scanner;
public class NumMenor {
	public static float menor(float a,float b,float c) {
		float min=a;
		if (b<min) {
			min=b;
		}
		if (c<min) {
			min=c;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		float num1=scanner.nextFloat();
		System.out.println("Ingrese el segundo numero: ");
		float num2=scanner.nextFloat();
		System.out.println("Ingrese el tercer numero: ");
		float num3=scanner.nextFloat();
		float resultado=menor(num1,num2,num3);
		System.out.println("El menor de los tres numeros es: "+resultado);
		scanner.close();
	}
}
