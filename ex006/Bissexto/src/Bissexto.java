import java.util.Scanner;
public class Bissexto {
	public static void main (String [] args) {
		int nasc, sobra;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o ano em que voc� nasceu:");
		nasc = in.nextInt ();
		sobra = nasc % 4;
		if (sobra == 0) {
			System.out.println("Seu ano � bissexto");
		}
		else {
			System.out.println("Seu ano n�o � bissexto");
		}
		}
}
