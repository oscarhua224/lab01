package num1;
import java.util.Random;
public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int[] frecuencia=new int[6];
		int numlanzamiento=20000;
		for (int i=0;i<numlanzamiento;i++) {
			int cara=rand.nextInt(6);
			frecuencia[cara]++;
		}
		System.out.println("Resultados de "+numlanzamiento+" lanzamientos: ");
		for (int i=0;i<frecuencia.length;i++) {
			System.out.println("Cara "+(i+1)+": "+frecuencia[i]+" veces");
		}
		int suma=6;
		for (int f:frecuencia) {
			suma +=f;
		}
		System.out.println("Total de lanzamientos verificado: "+suma);
	}
}
