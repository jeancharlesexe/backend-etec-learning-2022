
import java.util.Scanner;
public class Triang {
	public static void main (String [] args ) {
		int l1, l2, l3;
		boolean es, eq, tri;
		try {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o primeiro lado :");
		l1 = in.nextInt();
		System.out.println("Digite o segundo lado :");
		l2 = in.nextInt();
		System.out.println("Digite o terceiro lado :");
		l3 = in.nextInt();
		if (l1 < l2+l3 || l2 < l1+l3 || l3 < l2+l3) {
			System.out.println("Forma um tri�ngulo,");
			if (l1==l2 && l2==l3){
				System.out.println("Equilatero");
				
			} else if (  l1!=l2 && l2!=l3){
				System.out.println("Escaleno");
			} else {
				System.out.println("is�sceles");
			}
		} else {
			System.out.println("Isto n�o forma um tri�ngulo");
		}
	} catch (Exception erro) {
		System.out.println("Digite um n�mero inteiro v�lido, voc� usou v�rgulas, ou caracteres especiais \n."
				+"Erro"+erro+"\n"
				+"----------"
				+"execute novamento"
				+"----------");
	}
	}
}