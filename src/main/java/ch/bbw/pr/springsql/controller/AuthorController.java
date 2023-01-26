package ch.bbw.pr.springsql.controller;

import ch.bbw.pr.springsql.model.Author;
import ch.bbw.pr.springsql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepo;
    @GetMapping(path="/authors")
    public Iterable<Author> getAuthors() {
        return authorRepo.findAll();
    }
    @GetMapping(path="/author/{id}")
    public Author authorById(@PathVariable("id")int id) {
        return authorRepo.findById(id).get();
    }
    @PostMapping(path="/authors")
    public Author addAuthor(@RequestBody Author author) {
        return authorRepo.save(author);
    }
    @PutMapping(path="/author/{id}")
    public Author updateAuthor(@PathVariable("id")int id, @RequestBody Author author) {
        Author authorToUpdate = authorRepo.findById(id).get();
        authorToUpdate.setBio(author.getBio());
        authorToUpdate.setName(author.getName());
        authorToUpdate.setEmail(author.getEmail());
        authorToUpdate.setPassword(author.getPassword());
        authorToUpdate.setSavedArticles(author.getSavedArticles());
        authorToUpdate.setArticle(author.getArticle());
        return authorRepo.save(authorToUpdate);
    }

    @DeleteMapping(path="/author/{id}")
    public void deleteAuthor(@PathVariable("id")int id) {
        authorRepo.deleteById(id);
    }



}
