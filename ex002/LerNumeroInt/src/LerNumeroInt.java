import java.util.Scanner;
public class LerNumeroInt {
	public static void main (String[] args) {
		int a,b,c,v1,v2,v3,r;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o primeiro valor ");
		a= in.nextInt();
		System.out.println("Digite o segundo valor ");
		b= in.nextInt();
		System.out.println("Digite o terceiro valor");
		c= in.nextInt();
		v1= a*a;
		v2=b*b;
		v3=c*c;
		r=v1+v2+v3;
		System.out.println("a soma dos tr�s valores � "+r);
	}
}
