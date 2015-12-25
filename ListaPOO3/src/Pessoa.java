
public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	public Pessoa(String nome, String telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	public Pessoa(){}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getTelefone() {
		// TODO Auto-generated method stub
		return telefone;
	}

}
