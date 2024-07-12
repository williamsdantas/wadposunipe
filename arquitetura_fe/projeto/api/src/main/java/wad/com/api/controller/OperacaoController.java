package wad.com.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wad.com.api.operacao.DadosCadastroOperacao;
import wad.com.api.operacao.DadosListagemOperacoes;
import wad.com.api.operacao.Operacao;
import wad.com.api.operacao.OperacaoRepository;

@RestController
@RequestMapping("/operacoes")
public class OperacaoController {
	
	private OperacaoRepository repositorio = new OperacaoRepository();
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroOperacao dados) {
		repositorio.save(new Operacao(dados));
		
	}
	
	@GetMapping
	public List<DadosListagemOperacoes> getAtivos() {
		
		return repositorio.getAll().stream().map(DadosListagemOperacoes::new).toList();
		
	}


}
