package num1;
import java.util.Scanner;
public class Estacionamiento {
	public static double Cargo(int horas) {
		double cargo;
		if (horas<=0) {
			cargo=0;
		} else if (horas==1) {
			cargo=3.00;
		} else {
			cargo=3.00+(horas-1)*0.50;
		}
		if (cargo>12.00) {
			cargo=12.00;
		}
		return cargo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese el numero de horas: ");
		int horas=scanner.nextInt();
		double cargo=Cargo(horas);
		System.out.print("El cargo a pagar es: S/"+cargo);
		scanner.close();
	}
}
