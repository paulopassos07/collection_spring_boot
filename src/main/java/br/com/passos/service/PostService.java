package br.com.passos.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.passos.dominio.Post;
import br.com.passos.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Set<Post> listarTodos() {
        List<Post> list = postRepository.findAll();
        Set<Post> newList = new HashSet<>(list);
        return newList.stream().filter(post -> "Tecnologia".equals(post.getTema())).collect(Collectors.toSet());
    }

}
