
public class Livro {

	private String  titulo;
	private String  autor;
	private int     anoPubli;
	private String  categoria;
	private int     posE;
	private int     posP;
	private boolean emprestado;
	
	public Livro(String titulo, String autor, int anoPubli, String categoria, int posE, int posP, boolean emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPubli = anoPubli;
		this.categoria = categoria;
		this.posE = posE;
		this.posP = posP;
		this.emprestado = emprestado;
	}

	public Livro(String titulo, String autor, int anoPubli, String categoria) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPubli = anoPubli;
		this.categoria = categoria;
	}
	
	public String imprimir() {
		String res;
		res = "Livro: "+titulo+" / "+autor+" ("+anoPubli+")\n"+
		      "   Categoria "+categoria+"  Posicao: E "+posE+" P "+posP+"\n";
		String empr;
		if (emprestado) {
			empr = "   Livro Emprestado";
		}
		else {
			empr = "   Livro Disponivel no acervo";
		}
		return res + empr;	
	}

	public void emprestar() {
		this.emprestado = true;
	}
	
	public void devolver() {
		this.emprestado = false;
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPubli() {
		return anoPubli;
	}

	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPosE() {
		return posE;
	}

	public void setPosE(int posE) {
		this.posE = posE;
	}

	public int getPosP() {
		return posP;
	}

	public void setPosP(int posP) {
		this.posP = posP;
	}

	public boolean isEmprestado() {
		return emprestado;
	}
	
}
