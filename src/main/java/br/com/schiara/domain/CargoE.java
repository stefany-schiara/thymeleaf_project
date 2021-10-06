package br.com.schiara.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")
public class CargoE extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private DepartamentoE departamento;
	
	@OneToMany(mappedBy = "cargo")
	private List<FuncionarioE> funcionarios;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DepartamentoE getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoE departamento) {
		this.departamento = departamento;
	}

	public List<FuncionarioE> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<FuncionarioE> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
