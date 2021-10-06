package br.com.schiara.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.schiara.dao.IDepartamentoDao;
import br.com.schiara.domain.DepartamentoE;
import br.com.schiara.service.IDepartamentoService;

@Service @Transactional(readOnly = false)
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Autowired
	private IDepartamentoDao departamentoDao;
	
	@Override
	public void salvar(DepartamentoE departamentoE) {
		departamentoDao.save(departamentoE);
	}

	@Override
	public void alterar(DepartamentoE departamentoE) {
		departamentoDao.update(departamentoE);
	}

	@Override
	public void excluir(Long id) {
		departamentoDao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public DepartamentoE buscarPorId(Long id) {
		return departamentoDao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<DepartamentoE> buscarTodos() {
		return departamentoDao.findAll();
	}
	
	
}
