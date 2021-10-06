package br.com.schiara.dao;

import java.util.List;

import br.com.schiara.domain.DepartamentoE;

public interface IDepartamentoDao {

	void save(DepartamentoE departamentoE);
	
	void update(DepartamentoE departamentoE);
	
	public void delete(Long id);
	
	DepartamentoE findById(Long id);
	
	List<DepartamentoE> findAll();

}