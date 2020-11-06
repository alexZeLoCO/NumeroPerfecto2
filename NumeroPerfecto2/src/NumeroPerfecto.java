import java.util.Scanner;		//SCANNER
public class NumeroPerfecto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//TECLADO
		for (int i =1;i<=10000;i++) {		//REPETIR 10000 VECES
			int suma =0;		//INICIALIZA SUMATORIO
			for(int a=1; a<=i/2;a++) {
				if (i%a==0) {
					suma=suma+a;
				}
			}
			if (suma==i) {		//SI LA SUMA ES IGUAL AL NUMERO INICIAL
				System.out.printf("El número %d es perfecto.\n",suma);
			}
		}
		
		System.out.println("En un intervalo [a,b], hallar si hay o no números perfectos.");		//GUÍ USUARIO
		System.out.print("Defina a: ");		//SOLICITA VALOR
		int a = teclado.nextInt();		//INTERVALO A
		System.out.print("Defina b: ");		//SOLICITA VALOR
		int b = teclado.nextInt();		//INTERVALO B
		for (int i=a;i<=b;i++) {		//REPETIR 10000 VECES
			int suma =0;		//INICIALIZA SUMATORIO
			for(int n=1; n<=i/2;n++) {
				if (i%n==0) {
					suma=suma+n;
				}
			}
			if (suma==i) {		//SI LA SUMA ES IGUAL AL NUMERO INICIAL
				System.out.printf("El número %d es perfecto.\n",suma);
			}
		}

	}

}
