import java.util.Scanner;
public class PosNegNeu {
	public static void main (String [] args) {
		int valor;
		try {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o valor pra descobrir se � Positivo, Negativo ou Neutro:");
		valor = in.nextInt ();
		if (valor == 0 ) {
			System.out.println("Seu n�mero � Neutro");
		} else if (valor > 0) {
			System.out.println("Seu n�mero � Positivo");
		} else {
			System.out.println("Seu n�mero � Negativo");
		}
		} catch (Exception erro) {
			System.out.println("N�o digite letras ou caracteres especiais \n."
					+"Erro"+erro+"\n"
					+"----------"
					+"execute novamento"
					+"----------");
		}
	}
}
