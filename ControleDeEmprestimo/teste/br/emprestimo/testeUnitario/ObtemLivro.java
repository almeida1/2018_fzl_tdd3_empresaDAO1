package br.emprestimo.testeUnitario;

import java.util.ArrayList;

import br.emprestimo.modelo.Livro;

class ObtemLivro {
	public static Livro comDadosValidos() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		return livro;
	}

	public static Livro comISBNInvalido_branco() {
		Livro livro = new Livro();
		livro.setIsbn("");
		return livro;
	}

	public static Livro comISBNInvalido_nulo() {
		Livro livro = new Livro();
		livro.setIsbn(null);
		return livro;
	}
	public static ArrayList comQuatroLivros(){
		ArrayList<Livro> lista = new ArrayList<Livro>();
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		lista.add(livro);
		livro = new Livro();
		livro.setIsbn("22222");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Sommervile");
		lista.add(livro);
		livro = new Livro();
		livro.setIsbn("333333");
		livro.setTitulo("Java como Programar");
		livro.setAutor("Deitel");
		lista.add(livro);
		livro.setIsbn("444444");
		livro.setTitulo("Programacao");
		livro.setAutor("Carlos");
		lista.add(livro);
		return lista;
	}
}
