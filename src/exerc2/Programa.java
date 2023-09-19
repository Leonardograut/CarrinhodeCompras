package exerc2;

public class Programa {

	public static void main(String[] args) {
		
    CarrinhoDeCompras sc = new CarrinhoDeCompras();
    
    sc.adicionarItem("Feijao",1.0 , 5);
    sc.adicionarItem("Banana",10.0, 5);
    sc.adicionarItem("Morango",14.5, 5);
    sc.adicionarItem("Melao", 12.6, 4);
    
    
    sc.exibirItens();
    
    
    sc.removerItem("Feijao");
    
    sc.exibirItens();
    
    
    
    System.out.println("O Valor total De Todos os Produtos : " + sc.calcularValorTotal());
    
    
  
    
    
	}

	
}
