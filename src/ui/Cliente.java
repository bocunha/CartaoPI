package ui;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class Cliente {

	public static void main(String[] args) {
	    
		ArrayList<CartaoPrePago> cartoes;
		cartoes = new ArrayList<CartaoPrePago>();
		cartoes.add(new CartaoPrePago("1111122233334444","Professor Isidrao",2020,6));
		cartoes.add(new CartaoCashBack("2222333344445555","Professor Pardal",2021,2,1));
		cartoes.add(new CartaoCashBack("2222333344445555","Professor Roberto",2022,2,2));
		cartoes.add(new CartaoCashBack("2222333344445555","Professor Girafales",2023,2,3));

		
//		CartaoPrePago cartoes[];
//		cartoes = new CartaoPrePago[4];
//		cartoes[0] = new CartaoPrePago("1111122233334444","Professor Isidrao",2020,6);
//		cartoes[1] = new CartaoCashBack("2222333344445555","Professor Pardal",2021,2,1);
//		cartoes[2] = new CartaoCashBack("2222333344445555","Professor Roberto",2022,2,2);
//		cartoes[3] = new CartaoCashBack("2222333344445555","Professor Girafales",2023,2,3);

		
		for (CartaoPrePago c : cartoes ) {
			c.adicionarCredito(Double.parseDouble((JOptionPane.showInputDialog("Olá "+c.getNomeCartao()+"\nQuanto quer adicionar na conta?"))));
			JOptionPane.showMessageDialog(null, c.consultaCartao());
			
			if (c.comprar(Double.parseDouble((JOptionPane.showInputDialog("Quanto quer Gastar?"))))) {
				JOptionPane.showMessageDialog(null, "Compra Realizada com Sucesso!\n\n\n" + c.consultaCartao());
			} else { JOptionPane.showMessageDialog(null, "Saldo Insuficiente... :(\n\n" + c.consultaCartao()); }
		}
	}
}
