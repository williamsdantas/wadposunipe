package wad.com.api.ativo;

import java.util.ArrayList;
import java.util.List;

public class AtivoRepository {
	
	private ArrayList<Ativo> ativos = new ArrayList<Ativo>();
	
	public void save (Ativo ativo) {
		this.ativos.add(ativo);
		
	}
	
	public List<Ativo> getAll () {
		return ativos;
		
	}
	
	public Ativo get (String papel) {
		
		int id =0;
		
		while (id<ativos.size()) {
			if(ativos.get(id).getPapel().equals(papel)) {
				return ativos.get(id);				
			}
			else id++;
		}
		return null;
		
		
		
		
	}

}
