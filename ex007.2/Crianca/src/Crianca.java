import java.util.Scanner;
public class Crianca {
	public static void main (String [] args ){
		int nasc,atual, idade;
		try {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o ano em que voc� nasceu: ");
		nasc = in.nextInt ();
		System.out.println("Digite o ano atual : ");
		atual = in.nextInt ();
		idade = atual - nasc;
		if (idade <= 10 ){
			System.out.println("Voc� � uma crian�a.");
		} else if (idade >= 10 && idade <18) {
			System.out.println("Voc� � um adolescebte.");
			
		} else if (idade >=18 && idade <= 60){
			System.out.println("Voc� � um adulto.");
		} else {
			System.out.println("Voc� � um idoso.");
		}
		} catch (Exception erro) {
			System.out.println("Digite um n�mero inteiro. \n Erro: "+erro+" \n"
					+"-----------"
					+"Execute novamente"
					+"-----------");
		}
	}

}
