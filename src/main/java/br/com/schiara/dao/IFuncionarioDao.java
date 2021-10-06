package br.com.schiara.dao;

import java.util.List;

import br.com.schiara.domain.FuncionarioE;

public interface IFuncionarioDao {

	void save(FuncionarioE funcionarioE);
	
	void update(FuncionarioE funcionarioE);
	
	public void delete(Long id);
	
	FuncionarioE findById(Long id);
	
	List<FuncionarioE> findAll();

}