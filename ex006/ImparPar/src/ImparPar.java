import java.util.Scanner;
public class ImparPar {
	public static void main (String [] args ) {
		int numero, sobra;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o valor � ser verirficado");
		numero = in.nextInt ();
		sobra = numero % 2;
		if (sobra != 1) {
			System.out.println (" Verifica��o conclu�da. Seu n�mero � Par!");
		}
		else {
			System.out.println("Verifica��o conclu�da. Seu n�mero � Impar!");
		}
	}
}
