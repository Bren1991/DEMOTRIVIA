package com.JuegoTrivia.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JuegoTrivia.demo.model.Usuario;
import com.JuegoTrivia.demo.repository.UsuarioJpaRepository;

@Controller
@RequestMapping("registro")
public class RegistroController {
	
	@GetMapping("/")
	public String registro() {
		return "html/registro";
	}
/** Inyecto la instancia del repositorio: es el framework quien se encarga de instanciarnos 
 * el JpaRepository y darle valor a usuarioJpaRepository */
	
	@Autowired
	private UsuarioJpaRepository usuarioJpaRepository;
	
	
	@GetMapping("usuarios")
	public List<Usuario> getUsuarios(){
		List<Usuario> usuarios = usuarioJpaRepository.findAll();
		return usuarios;
	}
	
	@GetMapping("{id}")
	public Usuario getUsuarioById(@PathVariable("id") Integer id) {
		Optional<Usuario> unOptionalUsuario = usuarioJpaRepository.findById(id);
		return unOptionalUsuario.get();
	}

/**RequestBODY se usa para info sensible(claves,etc) por eso van por body "debajo de la mesa"*/
	
	@PostMapping("/")
	public Usuario insertUsuario(@RequestBody Usuario unUsuarioARegistrar) {
		
		Usuario unUsuarioRegistrado = this.usuarioJpaRepository.save(unUsuarioARegistrar);
		return unUsuarioRegistrado; 
		
/**podemos hacer q retorne 1 html q diga "gracias por registrarte" p/q el usuario lo vea*/
	}
	
/** Los usuarios se eliminan por ID */
	@DeleteMapping("{id}")
	public void deleteUsuario(@PathVariable("id") Integer id) {
		usuarioJpaRepository.deleteById(id);
	}

}
