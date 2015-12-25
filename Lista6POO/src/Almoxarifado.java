
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Almoxarifado {
	private List<Produto> produtos = new ArrayList<Produto>();
	Scanner leitor = new Scanner(System.in);

	public void cadastrarDados() {
		Produto p = new Produto();
		System.out.println("Nome do produto:");
		p.setNomeProduto(leitor.next());
		System.out.println("Quantidade:");
		p.setQuantidade(leitor.nextInt());
		produtos.add(p);
	}
	public void gerarRelatorio(){
		
		if(produtos.size()>0){
			System.out.println("Total de produtos cadastrados:"+produtos.size());
			for(Produto produto:produtos){
				System.out.println("Nome do produto:"+produto.getNomeProduto());
				System.out.println("Quantidade do produto:");
			} 
		}
		else{
			System.out.println("Nao ha produtos cadastrados");
		}
	}

	public void lerArquivo() {
		try {
			setProdutos((List<Produto>) Registro.reader("produtos.ser"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void salvarArquivo() {
		try {
			Registro.writer("produtos.ser", getProdutos());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void alterarDados() {
		if (produtos.size() > 0) {
			String opcaoMenu = "";
			while (!opcaoMenu.equals("2")) {
			
			System.out.println("1 - Inserir nome do produto");
			System.out.println("2 - Sair");
			opcaoMenu = leitor.next();
		
				String produtoPesquisa;
				System.out.println("Digite o nome do produto:");
				produtoPesquisa = leitor.next();
				for (Produto produto : produtos) {
					if (produto.getNomeProduto().equals(produtoPesquisa)) {
						String opcaoMenuAlterar = "";

						while (!opcaoMenuAlterar.equals("4")) {
							System.out.println("1 - Alterar o nome:");
							System.out.println("2 - Alterar a quantidade:");
							System.out.println("3 - Deletar");
							System.out.println("4 - Sair");
							opcaoMenuAlterar = leitor.next();
							if (opcaoMenuAlterar.equals("1")) {
								System.out.println("Insira o novo nome do produto:");
								produto.setNomeProduto(leitor.next());
							} 
							if (opcaoMenuAlterar.equals("2")) {
								System.out.println("Insira a nova quantidade:");
								produto.setQuantidade(leitor.nextInt());
							}
							if(opcaoMenuAlterar.equals("3")){
								produtos.remove(produto);
							}
						 if(opcaoMenuAlterar.equals("4")){
								break;
							}
						}

					} else {
						System.out.println("Nenhum produto com esse nome.");
					}
				}
			}
		} else {
			System.out.println("Nao ha nenhum produto cadastrado para se fazer uma busca.");
		}
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
