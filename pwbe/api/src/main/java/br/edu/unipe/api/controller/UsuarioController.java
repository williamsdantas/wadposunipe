package br.edu.unipe.api.controller;

import br.edu.unipe.api.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping
    public Usuario getUsuario(){
        return new Usuario(1,"@","wad");
    }
    @PostMapping
    public Usuario postUsuario(@RequestBody Usuario usuario){
        return usuario;
    }
    @PutMapping
    public Usuario putUsuario(@RequestBody Usuario usuario){
        return usuario;
    }
    @DeleteMapping
    public String deleteUsuario(){
        return "Chamada Delete usuário";
    }

}
