import java.util.Scanner;
public class ImparPar{
	public static void main (String [] args) {
		int i=1,x;
		try {Scanner in = new Scanner (System.in);
		while (i<=5) {	
			System.out.println("Digite o "+i+"� n�mero.");
			x = in.nextInt();
			if (x % 2== 0) {
				System.out.println("Este n�mero � Par");
			} else {
				System.out.println("Este n�mero � Impar");
			}
			i=i+1;
		}
		} catch (Exception erro) {
			System.out.println("Digite um n�mero inteiro, erro:"+erro);
		}
		System.out.println("-------------------------------");
		System.out.println("Programa encerrado;");
	}
}
