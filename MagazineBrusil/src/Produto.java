/* aqui estamos definindo a classe Produto
 * classe, pra nós, significa "Novo tipo de Dado"
 * 
 * este tipo, em especial, vai armazenar informações sobre um 
 * produto. Ex: nome, codigo, preco, qtde, categoria, etc....
 */

public class Produto {
	int    codigo;
	String nome;
	double preco;
	int    qtde;
	String categoria;
	
	/*  o segredo dos métodos é poder ter um trecho de código que obedece o padrão
	 *  E -> P -> S
	 *  
	 *  todo método tem a seguinte estrutura no cabeçalho
	 *  
	 *  TIPO_RETORNO   NOME ( LISTA DE PARÂMETROS/VARIÁVEIS DE ENTRADA) {
	 *        LÓGICA
	 *  }
	 */
	
	
	void imprimir() {
		System.out.println("Produto " + codigo + "  - " + nome);
		System.out.println("Categoria  " + categoria);
		System.out.println("Preco R$ " + preco + "   Quantidade  Estoque: " + qtde);
	}
	
	double calcularDesconto(double desconto){
		
		return preco - preco * desconto/100;
	}
}
