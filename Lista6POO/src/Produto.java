import java.io.Serializable;

public class Produto implements Serializable {
private int quantidade;
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
public String getNomeProduto() {
	return nomeProduto;
}
public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
}
private String nomeProduto;
public Produto(){
	
}
public Produto(String nomeProduto, int quantidade){
	this.nomeProduto = nomeProduto;
	this.quantidade = quantidade;
}
}
