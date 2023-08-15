package javaCollections;

public class TestaEqualsHashCode {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Pensamento Computacional", "Matheus");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno("Aluno 1", 873813);
		Aluno a2 = new Aluno("Aluno 2", 873814);
		Aluno a3 = new Aluno("Aluno 3", 873815);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println(javaColecoes.getAlunos());
		
//		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(javaColecoes.getAlunos());
//		System.out.println(alunosSincronizados);

		
		System.out.println("Aluno 1 matriculado: " + javaColecoes.estaMatriculado(a1));
		
		Aluno outroA1 = new Aluno("Aluno 1", 873834);
//		javaColecoes.matricula(outroA1);
		
		System.out.println("Outro 1 matriculado: " + javaColecoes.estaMatriculado(outroA1));
		System.out.println(outroA1 == a1);
		System.out.println(outroA1.equals(a1));
		System.out.println(outroA1.hashCode() == a1.hashCode());

	}
}