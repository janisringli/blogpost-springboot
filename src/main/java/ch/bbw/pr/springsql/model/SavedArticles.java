package ch.bbw.pr.springsql.model;

import jakarta.persistence.*;

@Entity
@Table(name = "savedArticles")
@NamedQuery(name = "SavedArticles.findAll", query = "FROM SavedArticles")
public class SavedArticles {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int articleId;
    private int authorId;

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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "SavedArticles{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", authorId=" + authorId +
                '}';
    }
}
