package wad.com.api.ativo;

public class Ativo {
	private long id;
	private String nome;
	private String papel;
	
	public Ativo(long id, String nome, String papel) {
		this.id = id;
		this.nome = nome;
		this.papel = papel;
	}
	
	public Ativo(DadosCadastroAtivo ativo) {
		this.id = 0;
		this.nome = ativo.nome();
		this.papel = ativo.papel();
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	

}
