package projeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import contratacao.Contratacao;

public class Projeto {
	private String nome;
	private Date dt_Inicio;
	private Date dt_Fim;
	private List<Contratacao> listaContratacao = new ArrayList<>();
	
	public Projeto(String nome, Date dt_Inicio, Date dt_Fim) {
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Fim = dt_Fim;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_Inicio() {
		return dt_Inicio;
	}

	public void setDt_Inicio(Date dt_Inicio) {
		this.dt_Inicio = dt_Inicio;
	}

	public Date getDt_Fim() {
		return dt_Fim;
	}

	public void setDt_Fim(Date dt_Fim) {
		this.dt_Fim = dt_Fim;
	}
	
	public boolean adicionarContratacao(Contratacao contratacao) 
	{
		if(contratacao != null && !listaContratacao.contains(contratacao)) 
    	{
    		listaContratacao.add(contratacao);
    		return true;
    	}
    	return false;
	}
	
    public boolean removerContratacao(Contratacao contratacao) 
    {
    	if(contratacao != null && listaContratacao.contains(contratacao) && listaContratacao.size() > 0) {
    		listaContratacao.remove(contratacao);
    		return true;
    	}
    	return false;
    }
	
    public void listarContratacao() 
    {
    	System.out.println("***Contratações***");
    	System.out.println("Projeto: " + this.nome);
    	System.out.println("Funcionário(s)");
    	
        for (Contratacao contratacao : listaContratacao )
        {
        	System.out.println(contratacao.getFuncionario().getNome()
        			+ " [Status:" + contratacao.getStatus() + "]"
        			);
        };
        System.out.print("\n");
    }

}