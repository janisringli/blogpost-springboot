package ch.bbw.pr.springsql.controller;

import ch.bbw.pr.springsql.model.SavedArticles;
import ch.bbw.pr.springsql.repository.SavedArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SavedArticlesController {
    @Autowired
    private SavedArticlesRepository savedArticlesRepo;
    @GetMapping(path="/savedarticles")
    public Iterable<SavedArticles> getSavedArticles() {
        return savedArticlesRepo.findAll();
    }

    @GetMapping(path="/savedarticle/{id}")
    public SavedArticles savedArticlesById(@PathVariable("id")int id) {
        return savedArticlesRepo.findById(id).get();
    }
    @PostMapping(path="/savedarticle")
    public SavedArticles addSavedArticles(@RequestBody SavedArticles savedArticles) {
        return savedArticlesRepo.save(savedArticles);
    }

    @PutMapping(path="/savedarticle/{id}")
    public SavedArticles updateSavedArticle(@PathVariable("id")int id, @RequestBody SavedArticles savedArticles) {
        SavedArticles savedArticlesToUpdate = savedArticlesRepo.findById(id).get();
        return savedArticlesRepo.save(savedArticlesToUpdate);
    }
    @DeleteMapping(path="/savedarticle/author/{id}")
    public void deleteSavedArticle(@PathVariable("id")int id) {
        savedArticlesRepo.deleteById(id);
    }




}
