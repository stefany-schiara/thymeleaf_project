package br.com.schiara.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.schiara.dao.IFuncionarioDao;
import br.com.schiara.domain.FuncionarioE;
import br.com.schiara.service.IFuncionarioService;

@Service @Transactional(readOnly = false) //esse é o padrao, mas vamos colocar so para isso comecar a ficar claro
public class FuncionarioServiceImpl implements IFuncionarioService{

	@Autowired
	private IFuncionarioDao funcionarioDao;
	
	@Override
	public void salvar(FuncionarioE funcionarioE) {
		funcionarioDao.save(funcionarioE);
	}

	@Override
	public void alterar(FuncionarioE funcionarioE) {
		funcionarioDao.update(funcionarioE);
	}

	@Override
	public void excluir(Long id) {
		funcionarioDao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public FuncionarioE buscarPorId(Long id) {
		return funcionarioDao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<FuncionarioE> buscarTodos() {
		return funcionarioDao.findAll();
	}

	
}
