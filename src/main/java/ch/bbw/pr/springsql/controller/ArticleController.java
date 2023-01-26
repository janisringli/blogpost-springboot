package ch.bbw.pr.springsql.controller;

import ch.bbw.pr.springsql.model.Article;
import ch.bbw.pr.springsql.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepo;
    @GetMapping(path="/articles")
    public Iterable<Article> getAuthors() {
        return articleRepo.findAll();
    }

    @GetMapping(path="/article/{id}")
    public Article articleById(@PathVariable("id")int id) {
        return articleRepo.findById(id).get();
    }
    @PostMapping(path="/articles")
    public Article addArticle(@RequestBody Article article) {
        return articleRepo.save(article);
    }

    @PutMapping(path="/article/{id}")
    public Article updateArticle(@PathVariable("id")int id, @RequestBody Article article) {
        Article articleToUpdate = articleRepo.findById(id).get();
        articleToUpdate.setAuthor(article.getAuthor());
        articleToUpdate.setTopic(article.getTopic());
        articleToUpdate.setTitle(article.getTitle());
        articleToUpdate.setReadtime(article.getReadtime());
        articleToUpdate.setContent(article.getContent());
        articleToUpdate.setDate(article.getDate());
        return articleRepo.save(articleToUpdate);
    }
    @DeleteMapping(path="/article/{id}")
    public void deleteArticle(@PathVariable("id")int id) {
        articleRepo.deleteById(id);
    }
}