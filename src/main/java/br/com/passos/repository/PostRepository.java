package br.com.passos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.passos.dominio.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
