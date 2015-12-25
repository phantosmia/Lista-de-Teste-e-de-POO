import java.io.File;

public class Ex1 {
static int contador = -1;
static void Processo(File arquivo){
	contador++;
	String espaco = "";
	for (int i = 0; i < contador; i++)
		espaco += " ";
	if(arquivo.isFile())
		System.out.println(espaco + "[Arquivo] " + arquivo.getName());
	else if (arquivo.isDirectory())
		System.out.println(espaco + "[Diretorio] " + arquivo.getName());
	File[] listaDeArquivos = arquivo.listFiles();
	if(listaDeArquivos != null){
		for(int i = 0; i < listaDeArquivos.length; i++)
			Processo(listaDeArquivos[i]);
	}
	else{
		System.out.println(espaco + " Acesso Negado");
	}
	contador--;
}
public static void main(String[] args){
	String diretorioInicial = "C:/";
	File arquivo = new File(diretorioInicial);
	Processo(arquivo);
}
}
