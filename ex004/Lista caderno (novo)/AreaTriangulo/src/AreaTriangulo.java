import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String[]s) {
		Scanner in = new Scanner (System.in);
		int altura,base,area;
		System.out.println("Digite a base do triangulo");
		base = in.nextInt();
		System.out.println("Digite a altura do traingulo");
		altura = in.nextInt();
		area = altura*base;
		System.out.println("A �rea do triangulo � " + area);
	} 

}
