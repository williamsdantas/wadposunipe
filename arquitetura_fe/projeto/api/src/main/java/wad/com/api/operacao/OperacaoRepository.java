package wad.com.api.operacao;

import java.util.ArrayList;
import java.util.List;



public class OperacaoRepository {
	private ArrayList<Operacao> operacoes = new ArrayList<Operacao>();
	
	public void save (Operacao op) {
		this.operacoes.add(op);
		
	}
	
	public List<Operacao> getAll () {
		return operacoes;
		
	}

}
