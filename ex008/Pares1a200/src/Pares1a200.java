import java.util.*;
public class Pares1a200 {
	public static void main (String [] args) {
		int i=0;
		try {
		System.out.println("Os n�meros pares de 1 ate 200 s�o:");
		while (i<=200) {
			System.out.println(i);
			i=i+2;
		}
		} catch (Exception erro) {
		System.out.println("Ocorreu um erro:"+erro);
		}
		System.out.println("-------------------------------");
		System.out.println("Programa encerrado;");
	}
}
