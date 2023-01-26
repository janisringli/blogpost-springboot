package ch.bbw.pr.springsql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "savedArticles")
@NamedQuery(name = "SavedArticles.findAll", query = "FROM SavedArticles")
public class SavedArticles {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int articleId;

    @OneToOne(mappedBy = "savedArticles", cascade = {CascadeType.ALL})
    @JsonIgnore
    Author author;
    public SavedArticles() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "SavedArticles{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", author=" + author +
                '}';
    }
}
