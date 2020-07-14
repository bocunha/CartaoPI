package model;

public class CartaoCashBack extends CartaoPrePago{
	protected int tipo;

		// Teste usando vetores diretos
	String[] nomeTipos = {"", "BRONZE","SILVER","GOLD"};
	Double[] pctTipos = {0.0, 0.02, 0.05, 0.08};
			 //tipos	 0  , 1   , 2   , 3    ;
	
	public CartaoCashBack(String numeroCartao, String nomeCartao, int anoValidade, int mesValidade, int tipo) throws Exception {
		super(numeroCartao, nomeCartao,anoValidade,mesValidade);
		if (tipo > 3 && tipo < 1 ) { throw new Exception("O tipo do cartao é de 1 a 3"); }
		this.tipo = tipo;
	}
	
		// 1 Bronze 2%
		// 2 Silver 5%
		// 3 GOLD 8%
	
		public boolean comprar(double valor) throws Exception {
			if (valor <= 0 ) { throw new Exception("Digite um valor maior que 0"); }
			if (super.saldo >= valor) {

				super.saldo -= valor;
				super.saldo += valor*(this.pctTipos[this.tipo]);

				return true;
				} else { 
					return false; }
		}
		
		public String consultaCartao() {
			return ("Numero Cartao: "+this.numeroCartao
					+"\nNome Cartao: "+this.nomeCartao
					+"\nValidade: " +this.mesValidade+"/"+this.anoValidade
					+"\nTipo do Cartao: " +nomeTipos[tipo]
					+"\nSaldo: "+ +this.saldo);			
		}
}