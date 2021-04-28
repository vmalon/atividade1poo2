package funcionario;

import enums.TipoDeDocumento;

public class Funcionario {
    private String nome;
    private String numeroDocumento;
    private TipoDeDocumento tipoDeDocumento;
    
	public Funcionario(String nome, TipoDeDocumento tipoDeDocumento, String numeroDocumento) {
		this.nome = nome;
		this.numeroDocumento = numeroDocumento;
		this.tipoDeDocumento = tipoDeDocumento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public TipoDeDocumento getTipoDeDocumento() {
		return tipoDeDocumento;
	}

	public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}	
	
	
}