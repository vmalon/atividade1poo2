package contratacao;

import java.util.Date;
import java.util.List;

import enums.Cargo;
import enums.Status;
import funcionario.Funcionario;
import projeto.Projeto;

public class Contratacao {
	private Date data;
	private Cargo cargo;
	private Status status;
	private Projeto projeto;
	private Funcionario funcionario;
		
	public Contratacao(Date data,Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.status = Status.PENDENTE;
		this.data = data;
		this.projeto = projeto;
		this.funcionario = funcionario; 
		this.cargo = cargo;
		projeto.adicionarContratacao(this);
	}
	
	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		this.status = Status.CONTRATADO;
	}
	
	public void demitir() {
		this.projeto.removerContratacao(this);
		this.status = Status.DEMITIDO;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Status getStatus() {
		return status;
	}

	public Date getData() {
		return this.data;
	}
	
	public Projeto getProjeto() {
		return projeto;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}
	
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}


	
}