import java.util.Scanner;
public class Eleitor {
	public static void main (String[] args) {
		int idade,atual,nasc ;
		Scanner in = new Scanner (System.in);
		System.out.println("Qual o ano em que voc� nasceu?");
		nasc = in.nextInt();
		System.out.println("Qual o ano atual?");
		atual = in.nextInt();
		idade = atual-nasc;
		System.out.println("Sua idade � "+idade+" anos, ent�o");
		if (idade >= 16) {
			System.out.println("Voc� est� aprovado para tirar o T�tulo de eleior");
		}
		
	}

}
