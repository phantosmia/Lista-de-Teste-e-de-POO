import java.io.Serializable;

public class Caixa implements Serializable {
	private double totalVendas;
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	public double getPagamentosSaida() {
		return pagamentosSaida;
	}
	public void setPagamentosSaida(double pagamentosSaida) {
		this.pagamentosSaida = pagamentosSaida;
	}
	public double getDespesasGerais() {
		return despesasGerais;
	}
	public void setDespesasGerais(double despesasGerais) {
		this.despesasGerais = despesasGerais;
	}
	public double getSalarioFuncionarios() {
		return salarioFuncionarios;
	}
	public void setSalarioFuncionarios(double salarioFuncionarios) {
		this.salarioFuncionarios = salarioFuncionarios;
	}
	private double pagamentosSaida;
	private double despesasGerais;
	private double salarioFuncionarios;
	private int mes;
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
}
