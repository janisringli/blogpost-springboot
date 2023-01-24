package ch.bbw.pr.springsql.repository;

import ch.bbw.pr.springsql.model.SavedArticles;
import org.springframework.data.repository.CrudRepository;

public interface SavedArticlesRepository extends CrudRepository<SavedArticles, Integer> {
}
