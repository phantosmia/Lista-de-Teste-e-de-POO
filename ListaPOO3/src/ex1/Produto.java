package ex1;

public class Produto {
	private double preco;
	private int codigo;
	private int qtdVendida;
	private double total;

	public Produto(double preco, int codigo, int qtdVendida, double total) {
		this.preco = preco;
		this.codigo = codigo;
		this.qtdVendida = qtdVendida;
		this.total = total;

	}

	public double getPreco(double preco) {
		return preco;
	}

	public int getCodigo(int codigo) {
		return codigo;
	}

	public int getQtdVendida(int qtdVendida) {
		return qtdVendida;
	}

	public double getTotal(double total) {
		return total;
	}

	public void setPreco() {
		this.preco = preco;
	}

	public void setCodigo() {
		this.codigo = codigo;
	}

	public void setQtdVendida() {
		this.qtdVendida = qtdVendida;
	}

	public void setTotal() {
		this.total = total;
	}

}
