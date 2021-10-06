package br.com.schiara.dao;

import java.util.List;

import br.com.schiara.domain.CargoE;

public interface ICargoDao {

	void save(CargoE cargoE);
	
	void update(CargoE cargoE);
	
	public void delete(Long id);
	
	CargoE findById(Long id);
	
	List<CargoE> findAll();

}