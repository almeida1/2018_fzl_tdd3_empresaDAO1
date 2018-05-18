package br.emprestimo.modelo;

import java.util.ArrayList;

public class EmprestimoDAO {
	ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

	public boolean adiciona(Emprestimo umEmprestimo) {
		if (verificaQuantidadeDeEmprestimos(umEmprestimo.getUsuario().getRa())) {
			throw new RuntimeException("Ja existem tres emprestimos para este usuario");
		}
		return emprestimos.add(umEmprestimo);
	}

	public boolean verificaQuantidadeDeEmprestimos(String codUsuario) {
		int quantidade = 0;
		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimo.getUsuario().getRa().equals(codUsuario)) {
				quantidade = quantidade + 1;
			}
		}
		System.out.println(emprestimos.size());
		return quantidade > 2;
	}
	
	
	
	
	
	
	

}
