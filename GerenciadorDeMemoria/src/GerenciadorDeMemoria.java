
public class GerenciadorDeMemoria {
	public static void main(String[] args) {
		
		Produto p=null;
		for (int cont=1; cont<=10; cont++) {
			p = new Produto(cont, "Produto"+cont, cont*10.0);
		}
		System.gc();
		
		System.out.println(" Ultimo objeto que foi criado = "+p.getCodigo());
		
		// forçando um estouro de pilha - isso irá fazer a máquina virtual Java encerrar abruptamente
		Utilitario u = new Utilitario();
		u.fatorial(10);
	}

}
