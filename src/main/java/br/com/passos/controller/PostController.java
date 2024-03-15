package br.com.passos.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.passos.dominio.Post;
import br.com.passos.service.PostService;

@RestController
@RequestMapping("/collection")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public ResponseEntity<Set<Post>> listarTodos() {
        Set<Post> list = postService.listarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    /*
     * @GetMapping
     * public ResponseEntity<List<Post>> listarTodos() {
     * List<Post> list = postService.listarTodos();
     * return ResponseEntity.status(HttpStatus.OK).body(list);
     * }
     */

}
