package br.com.schiara.service;

import java.util.List;

import br.com.schiara.domain.FuncionarioE;

public interface IFuncionarioService {

	void salvar(FuncionarioE funcionario);

	void alterar(FuncionarioE funcionario);

	void excluir(Long id);

	FuncionarioE buscarPorId(Long id);

	List<FuncionarioE> buscarTodos();
}
