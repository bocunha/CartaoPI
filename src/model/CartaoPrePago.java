package model;

public class CartaoPrePago {
	protected String numeroCartao;
	protected String nomeCartao;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	public void adicionarCredito(double valor) throws Exception {
		if (valor <= 0 ) { throw new Exception("Digite um valor maior que 0"); }
		saldo += valor;
	}
	
	public CartaoPrePago(String numeroCartao, String nomeCartao, int anoValidade, int mesValidade) throws Exception {
		super();
		if (numeroCartao.length() != 16) { throw new Exception("O numero do cartao deve conter 12 digitos"); }
		if (nomeCartao.length() <= 4) { throw new Exception("O Nome deve ter pelo menos 4 catacteres"); }
		if (anoValidade < 2020 ) { throw new Exception("O ano deve partir de 2020"); }
		if (mesValidade < 01 || mesValidade > 12 ) { throw new Exception("O mes deve ser entre 1 e 12"); }
		
		this.numeroCartao = numeroCartao; 
		this.nomeCartao = nomeCartao;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = 0;
	}
	
	public boolean comprar(double valor) throws Exception {
		if (valor <= 0 ) { throw new Exception("Digite um valor maior que 0"); }
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
