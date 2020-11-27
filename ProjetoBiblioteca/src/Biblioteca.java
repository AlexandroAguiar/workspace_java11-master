import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] args) {
		
		Livro l1, l2, l3;
		Scanner teclado  = new Scanner(System.in);
		int opcao;
		int numLivro;
		
		
		Livro livroAtual;
		
		l1 = new Livro("Java Basico","Isidro",2020,"Terror          ", 1, 2, false);
		l2 = new Livro("Java OO    ","Isidro",2020,"Ciencias Ocultas", 1, 3, false);
		l3 = new Livro("Java Web   ","Isidro",2020,"Ficção          ", 1, 4, false);
		
		do {
			System.out.println("*******************************************************");
			System.out.println("* Livraria do Isidro - Complete: Escreveu, não leu... *");
			System.out.println("*******************************************************");
			System.out.println("");
			System.out.println("  1 para exibir o acervo completo ");
			System.out.println("  2 para emprestar um livro       ");
			System.out.println("  3 para devolver um livro        ");
			System.out.println(" -1 para encerrar                 ");
			System.out.println("");
			System.out.print  ("  Digite sua opcao: ");
			
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println(l1.imprimir());
				System.out.println(l2.imprimir());
				System.out.println(l3.imprimir());
				break;
			case 2:
				System.out.print("  Por favor digite o livro (1, 2 ou 3): ");
				numLivro = teclado.nextInt();
				if (numLivro == 1) {
					livroAtual = l1;
				}
				else if (numLivro == 2) {
					livroAtual = l2;
				}
				else {
					livroAtual = l3;
				}
				if (livroAtual.isEmprestado()) {
					System.out.println( "  LIVRO INDISPONIVEL PARA EMPRESTIMO");
				}
				else {
					livroAtual.emprestar();
					System.out.println("   Emprestimo efetivado");
				}
				break;
			case 3:
				System.out.print("  Digite o livro a devolver (1, 2 ou 3) :");
				numLivro = teclado.nextInt();
				if (numLivro == 1) {
					livroAtual = l1;
				}
				else if (numLivro == 2) {
					livroAtual = l2;
				}
				else {
					livroAtual = l3;
				}
				if (livroAtual.isEmprestado()) {
					livroAtual.devolver();
					System.out.println("   Devolucao feita com sucesso");
				}
				else {
					System.out.println("   IMPOSSIVEL DEVOLVER LIVRO QUE NAO FOI EMPRESTADO");
				}
				break;
			case -1:
			default:
				System.out.println(" --> ERRO - Opcao INVALIDA");
			}
			
		} while (opcao != -1);
		
		
		
	}

}
