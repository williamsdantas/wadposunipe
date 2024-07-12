package wad.com.api.ativo;

public record DadosListagemAtivos(String nome, String papel) {
	
	public DadosListagemAtivos(Ativo ativo) {
		this(ativo.getNome(),ativo.getPapel());
	}

}
