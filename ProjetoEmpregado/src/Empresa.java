
public class Empresa {
	public static void main(String[] args) {
		
		
		
		
		
		Empregado e1, e2, e3;
		
		e1 = new Empregado("Professor Isidro","Professor",25000.00);
		e2 = new Empregado("Adalberto Moreira","Coordenador");
		e3 = new Empregado("Claudineia Tavares","Cargo nao definido",1000);
		
		
		/*
		e1.setNome("Professor Isidro");
		e1.setCargo("Professor");
		e1.setSalario(25000.00);
		
		e2.setNome("Adalberto Moreira");
		e2.setCargo("Coordenador");
		e2.setSalario(12814.00);
		
		e3.setNome("Claudineia Tavares");
		e3.setCargo("Diretora");
		e3.setSalario(32987.12);
		*/
		
		System.out.println("  ******* antes do aumento do ordenado ********* ");
		System.out.println(e1.imprimir());
		System.out.println(e2.imprimir());
		System.out.println(e3.imprimir());
		
		e1.aumentarSalario(12.72);
		e2.aumentarSalario(14.87);
		e3.aumentarSalario(9.34);
		
		System.out.println(" ******* depois do aumento do ordenado **********");
		System.out.println(e1.imprimir());
		System.out.println(e2.imprimir());
		System.out.println(e3.imprimir());
	}

}
