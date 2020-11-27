public class Principal {
	public static void main(String[] args) {

		// declarei uma variável do tipo Produto (Chamei de p)
		Produto p;
		Produto p2;
		
		// o que faz o operador NEW?
		// basicamente ele cria a área de memória correspondente à estutura do tipo Produto
		p = new Produto(); 
		p2 = new Produto();

		// vamos preencher o produto com valores?
		p.codigo    = 123;
		p.nome      = "Bolsa Luis Vintao";
		p.preco     = 29.90;
		p.categoria = "Acessorios";
		p.qtde      = 10;
		
		p2.codigo    = 456;
		p2.nome      = "Relogio Roléquizz";
		p2.preco     = 59.90;
		p2.categoria = "Moda Fina";
		p2.qtde      = 6;
		
		p.imprimir();
		double novoPreco1;
		novoPreco1 = p.calcularDesconto(15.0);
		System.out.println("Desconto promocional - "+novoPreco1);
	    System.out.println();
	    
	    
		p2.imprimir();
		double novoPreco2;
		novoPreco2 = p2.calcularDesconto(20.0);
		System.out.println("Novo preco do produto 2 "+novoPreco2);
		
	}
}
