import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		float b;

		System.out.println("Digite o valor do A");
		a = teclado.nextInt();
		System.out.println("Valor do a = " + a);

		System.out.println("Agora digite B");
		b = teclado.nextFloat();
		System.out.println("Valor do b = " + b);
		teclado.close();
	}
}