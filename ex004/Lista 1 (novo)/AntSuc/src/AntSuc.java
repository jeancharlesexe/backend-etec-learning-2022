import java.util.Scanner;
public class AntSuc {
	public static void main (String[] args) {
		int a,an,su;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o n�mero para descobrir seu sucesso e antecessor");
		a= in.nextInt();
		an=a-1;
		su=a+1;
		System.out.println("O seu antecesor � "+an+" ,e seu sucessor � "+su);
	}
}
