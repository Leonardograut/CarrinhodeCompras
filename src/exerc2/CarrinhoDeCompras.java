package exerc2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {

	
	private List<Item> itemList;
	
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		
		itemList.add(new Item(nome,preco,quantidade));
		
	}
	
	public  void  removerItem(String nome) {
		List<Item>itemRemover = new ArrayList<>();
	    for (Item item : itemList) {
			if (item.getNome().equalsIgnoreCase(nome)) {
				itemRemover.add(item);
				
			}
		}
		
	    itemList.removeAll(itemRemover);
	}
	
	
	public double calcularValorTotal() {
		double valorTotal = 0.0;
		
		
		
		if (!itemList.isEmpty()) {
			
			
			for (Item item : itemList) {
				
			    double valor = item.getPreco() * item.getQuantidade();
					
					valorTotal += valor;
				
				}
				
				return valorTotal;
			
		} else {

		}
		
		return valorTotal;
		
		
		
		
		
	}
	
	
	
	public void exibirItens() {
		System.out.println(itemList);
	}
	
	
	
	
	
	
	
}


