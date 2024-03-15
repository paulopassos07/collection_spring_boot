package br.com.passos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.passos.dominio.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
