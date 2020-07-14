package ui;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class Cliente {

	public static void main(String[] args) {
	    try {
	    	int continuar = 1;
	    	do { 
		    	ArrayList<CartaoPrePago> cartoes = new ArrayList<CartaoPrePago>();
		    	
				cartoes.add(new CartaoPrePago("1111122233334444","Professor Isidrao",2020,6));
//				cartoes.add(new CartaoCashBack("2222333344445555","Professor Pardal",2021,2,1));
//				cartoes.add(new CartaoCashBack("2222333344445555","Professor Roberto",2022,2,2));
//				cartoes.add(new CartaoCashBack("2222333344445555","Professor Girafales",2023,2,3));
//		
				for (CartaoPrePago c : cartoes ) {
					c.adicionarCredito(Double.parseDouble((JOptionPane.showInputDialog("Olá "+c.getNomeCartao()+"\nQuanto quer adicionar na conta?"))));
					JOptionPane.showMessageDialog(null, c.consultaCartao());
					
					if (c.comprar(Double.parseDouble((JOptionPane.showInputDialog("Quanto quer Gastar?"))))) {
						JOptionPane.showMessageDialog(null, "Compra Realizada com Sucesso!\n\n\n" + c.consultaCartao());
					} else { JOptionPane.showMessageDialog(null, "Saldo Insuficiente... :(\n\n" + c.consultaCartao()); }
				}
				continuar = (Integer.parseInt(JOptionPane.showInputDialog("Quer Continuar? 1 - Sim e 0 - Nao")));
	    	} while (continuar != 0 );
	    	
	    } catch (Exception e) {
			System.out.println("ERRO 404 " + e.getMessage());
			System.out.println("ERRO 404 " + e.getClass().getName());


	    }
	}
}
