package ch.bbw.pr.springsql.controller;

import ch.bbw.pr.springsql.model.SavedArticles;
import ch.bbw.pr.springsql.repository.SavedArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SavedArticlesController {
    @Autowired
    private SavedArticlesRepository savedArticlesRepo;
    @GetMapping(path="/savedarticles/author/{id}")
    public Iterable<SavedArticles> savedArticlesByAuthorId(@PathVariable("id")int id) {
        return savedArticlesRepo.findByAuthorId(id);
    }
    @GetMapping(path="/savedarticle/{id}")
    public SavedArticles savedArticlesById(@PathVariable("id")int id) {
        return savedArticlesRepo.findById(id).get();
    }
    @PostMapping(path="/savedarticles")
    public SavedArticles addSavedArticles(@RequestBody SavedArticles savedArticles) {
        return savedArticlesRepo.save(savedArticles);
    }
    @PutMapping(path="/savedarticle/{id}")
    public SavedArticles updateSavedArticles(@PathVariable("id")int id, @RequestBody SavedArticles savedArticles) {
        SavedArticles savedArticlesToUpdate = savedArticlesRepo.findById(id).get();
        savedArticlesToUpdate.setArticleId(savedArticles.getArticleId());
        savedArticlesToUpdate.setAuthorId(savedArticles.getAuthorId());
        return savedArticlesRepo.save(savedArticlesToUpdate);
    }
    @DeleteMapping(path="/savedarticle/{id}")
    public void deleteSavedArticles(@PathVariable("id")int id) {
        savedArticlesRepo.deleteById(id);
    }




}
