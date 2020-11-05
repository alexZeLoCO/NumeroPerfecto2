import java.util.Scanner;		//SCANNER
public class NumeroPerfecto {

	public static void Perfecto (int n) {		//SUBRUTINA
		int i = 1;		//INICIALIZA I (POSIBLE DIVISOR)
		int suma =0;		//INICIALIZA SUMATORIO
		while (i<=n/2) {		//MIENTRAS LA I SEA MENOR O IGUAL A LA MITAD DE N
			if (n%i==0) {		//SI I ES DIVISOR
				suma = suma + i;		//SUMAR
			}
			i++;		//SUMAR UNO A LA I
		}	
		if (suma==n) {		//SI LA SUMA ES IGUAL AL NUMERO INICIAL
			System.out.printf("El número %d es perfecto.\n",n);		//OUTPUT
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//TECLADO
		for (int i =1;i<=10000;i++) {		//REPETIR 10000 VECES
			Perfecto(i);		//LLAMADA SUBRUTINA
		}
		System.out.println("En un intervalo [a,b], hallar si hay o no números perfectos.");		//GUÍ USUARIO
		System.out.print("Defina a: ");		//SOLICITA VALOR
		int a = teclado.nextInt();		//INTERVALO A
		System.out.print("Defina b: ");		//SOLICITA VALOR
		int b = teclado.nextInt();		//INTERVALO B
		for (int i = a;i<=b;i++) {		//REPETIR PARA LOS VALORES ENTRE A Y B
			Perfecto(i);		//LLAMADA SUBRUTINA
		}

	}

}
