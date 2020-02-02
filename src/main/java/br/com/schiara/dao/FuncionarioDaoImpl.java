package br.com.schiara.dao;

import org.springframework.stereotype.Repository;

import br.com.schiara.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

}
