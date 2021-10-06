package br.com.schiara.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.schiara.dao.ICargoDao;
import br.com.schiara.domain.CargoE;
import br.com.schiara.service.ICargoService;

@Service @Transactional(readOnly = false)
public class CargoServiceImpl implements ICargoService {

	@Autowired
	private ICargoDao cargoDao;
	
	@Override
	public void salvar(CargoE cargoE) {
		cargoDao.save(cargoE);		
	}

	@Override
	public void alterar(CargoE cargoE) {
		cargoDao.update(cargoE);		
	}

	@Override
	public void excluir(Long id) {
		cargoDao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public CargoE buscarPorId(Long id) {
		return cargoDao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<CargoE> buscarTodos() {
		return cargoDao.findAll();
	}
	
}
