import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Relatorio {
private List<Caixa> fechamentos = new ArrayList<Caixa>();
public List<Caixa> getFechamentos() {
	return fechamentos;
}
public void setFechamentos(List<Caixa> fechamentos) {
	this.fechamentos = fechamentos;
}
Scanner leitor = new Scanner(System.in);
public void cadastrarDados(){
	Caixa c = new Caixa();
	System.out.println("Valor do pagamento:");
	c.setPagamentosSaida(leitor.nextDouble());
	System.out.println("Total de vendas:");
	c.setTotalVendas(leitor.nextDouble());
	System.out.println("Despesas gerais");
	c.setDespesasGerais(leitor.nextDouble());
	System.out.println("Salario funcionario");
	c.setSalarioFuncionarios(leitor.nextDouble());
	System.out.println("Mes do fechamento:");
	c.setMes(leitor.nextInt());
	fechamentos.add(c);
}
public void gerarRelatorio(){
	if(fechamentos.size()>0){
		System.out.println("Total de fechamentos cadastrados:"+fechamentos.size());
		for(Caixa fechamento:fechamentos){
			System.out.println("Valor do pagamento:"+fechamento.getPagamentosSaida());
			System.out.println("Total de vendas:"+fechamento.getTotalVendas());
			System.out.println("Despesas gerais:"+fechamento.getDespesasGerais());
			System.out.println("Salario funcionario:"+fechamento.getSalarioFuncionarios());
			System.out.println("Mes do fechamento:"+fechamento.getMes());
		} 
	}
	else{
		System.out.println("Nao ha produtos cadastrados");
	}
}
public void lerArquivo(){
	try {
		setFechamentos((List<Caixa>) Registro.reader("fechamentos.ser"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void salvarArquivo(){
	try {
		Registro.writer("fechamentos.ser", getFechamentos());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
