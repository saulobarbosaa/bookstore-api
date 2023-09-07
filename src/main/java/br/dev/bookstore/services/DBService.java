package br.dev.bookstore.services;

import br.dev.bookstore.domain.Categoria;
import br.dev.bookstore.domain.Livro;
import br.dev.bookstore.repositories.CategoriaRepository;
import br.dev.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBanco() {
        Categoria cat1 = new Categoria(null, "TI", "Livro de TI");
        Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsum", cat1);
        cat1.getLivros().addAll(Arrays.asList(l1));
        this.categoriaRepository.saveAll(Arrays.asList(cat1));
        this.livroRepository.saveAll(Arrays.asList(l1));
    }

}
