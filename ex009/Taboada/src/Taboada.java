import java.util.Scanner;
public class Taboada {
	public static void main (String [] args) {
		int i = 0,n,resultado;
		Scanner in = new Scanner (System.in);
		try {
		System.out.println("Digite o n�mero para saber a tabuada: ");
		n = in.nextInt ();
		do {
			resultado = i * n ;
			System.out.println(n+" x "+i+" = "+resultado);
			i++;
		} while (i<=10);
		} catch (Exception erro) {
			System.out.println("Digite um valor v�lido \n Execute novamente");
		}
	}
}
