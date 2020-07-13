package model;

public class CartaoCashBack extends CartaoPrePago{
	protected int tipo;

	public CartaoCashBack(String numeroCartao, String nomeCartao, int anoValidade, int mesValidade, int tipo) {
		super(numeroCartao, nomeCartao,anoValidade,mesValidade);
		this.tipo = tipo;
	}
	
		// 1 Bronze 2%
		// 2 Silver 5%
		// 3 GOLD 8%
	
		public boolean comprar(double valor) {
			if (super.saldo >= valor) {
					Tipo tipo[];
					tipo = new Tipo[4];
					tipo[0] = new Tipo(1,0.02);
					tipo[1] = new Tipo(1,0.02);
					tipo[2] = new Tipo(2,0.05);
					tipo[3] = new Tipo(3,0.08);

				super.saldo -= valor;
				super.saldo += valor*(tipo[this.tipo].getPct());

//				switch (tipo) {O
//					case 1: super.saldo -= valor; super.saldo += valor*0.02; break;
//					case 2: super.saldo -= valor; super.saldo += valor*0.05; break;
//					case 3: super.saldo -= valor; super.saldo += valor*0.08; break; }
				return true;
				} else { 
					return false; }
		}
		
		public String consultaCartao() {
			String nTipo = "";
			switch (tipo) {
			case 1: nTipo = "Bronze"; break;
			case 2: nTipo = "Silver"; break;
			case 3: nTipo = "Gold"; break; }
			return ("Numero Cartao: "+this.numeroCartao
					+"\nNome Cartao: "+this.nomeCartao
					+"\nValidade: " +this.mesValidade+"/"+this.anoValidade
					+"\nTipo do Cartao: " +nTipo
					+"\nSaldo: "+ +this.saldo);			
		}
}

