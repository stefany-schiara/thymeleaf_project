package br.com.schiara.service;

import java.util.List;

import br.com.schiara.domain.DepartamentoE;

public interface IDepartamentoService {
	
	void salvar(DepartamentoE departamento);
	
	void alterar(DepartamentoE departamento);
	
	void excluir(Long id);
	
	DepartamentoE buscarPorId(Long id);
	
	List<DepartamentoE> buscarTodos();
}
