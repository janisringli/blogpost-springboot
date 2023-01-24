package ch.bbw.pr.springsql.repository;

import ch.bbw.pr.springsql.model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Integer> {
}
