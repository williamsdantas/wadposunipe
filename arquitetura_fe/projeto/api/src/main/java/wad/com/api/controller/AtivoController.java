package wad.com.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wad.com.api.ativo.Ativo;
import wad.com.api.ativo.AtivoRepository;
import wad.com.api.ativo.DadosCadastroAtivo;
import wad.com.api.ativo.DadosListagemAtivos;

@RestController
@RequestMapping("/ativos")
public class AtivoController {
	
	private AtivoRepository repositorio = new AtivoRepository();
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroAtivo dados) {
		
		repositorio.save(new Ativo(dados));
		
	}
	
	@GetMapping
	public List<DadosListagemAtivos> getAtivos() {
		
		return repositorio.getAll().stream().map(DadosListagemAtivos::new).toList();
		
	}

}
