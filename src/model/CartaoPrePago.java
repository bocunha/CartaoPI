package model;

public class CartaoPrePago {
	protected String numeroCartao;
	protected String nomeCartao;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	public void adicionarCredito(double valor) {
		saldo += valor;
	}
	
	public CartaoPrePago(String numeroCartao, String nomeCartao, int anoValidade, int mesValidade) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeCartao = nomeCartao;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = 0;
	}
	
	public boolean comprar(double valor) {
		if (this.saldo >= valor) { 
			this.saldo -= valor; 
			return true;
			} else { 
				return false; }
	}
	
	public String consultaCartao() {
		return ("Numero Cartao: "+this.numeroCartao
				+"\nNome Cartao: "+this.nomeCartao
				+"\nValidade: " +this.mesValidade+"/"+this.anoValidade
				+"\nSaldo: "+ +this.saldo);			
	}
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeCartao() {
		return nomeCartao;
	}
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	
}
