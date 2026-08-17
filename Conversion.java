package num1;
import java.util.Scanner;
public class Conversion {
	public static int convertirSeg(int horas,int minutos,int segundos) {
		return (horas*3600)+(minutos*60)+segundos;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Ingrese las horas: ");
		int horas=scanner.nextInt();
		System.out.print("Ingrese los minutos: ");
		int minutos=scanner.nextInt();
		System.out.print("Ingrese los segundos: ");
		int segundos=scanner.nextInt();
		int total=convertirSeg(horas,minutos,segundos);
		System.out.println("El equivalente en segundos es: "+total);
		scanner.close();
	}
}
