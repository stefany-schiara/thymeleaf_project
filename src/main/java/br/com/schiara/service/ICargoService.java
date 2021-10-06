package br.com.schiara.service;

import java.util.List;

import br.com.schiara.domain.CargoE;

public interface ICargoService {
	
	void salvar(CargoE cargo);

	void alterar(CargoE cargo);

	void excluir(Long id);

	CargoE buscarPorId(Long id);

	List<CargoE> buscarTodos();
}
