import java.util.*;
public class Somatorio{
	public static void main (String [] args) {
		int i=1,soma=0;
		try {
		System.out.println("A sequ�ncia do somat�rio de 1 at� 100 �:");
		while (i<=100) {	
			soma = soma + i;
			System.out.println(soma);
			i=i+1;
		}
		} catch (Exception erro) {
		System.out.println("Ocorreu um erro:"+erro);
		}
		System.out.println("-------------------------------");
		System.out.println("Programa encerrado;");
	}
}
