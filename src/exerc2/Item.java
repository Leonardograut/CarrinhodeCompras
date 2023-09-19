package exerc2;

public class Item extends CarrinhoDeCompras {

	private String nome;
	
	private double preco;
	private int quantidade;
	
	
	public String getNome() {
		return nome;
	}


	public double getPreco() {
		return preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	
	
	
	public Item(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public String toString() {
	    return "Nome: " + this.getNome() + 
	           ", Preco: " + this.getPreco() +
	           ", Quantidade: " + this.getQuantidade();
	}
	
	
	
	
	
}
