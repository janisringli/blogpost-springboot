package ch.bbw.pr.springsql.repository;

import ch.bbw.pr.springsql.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
