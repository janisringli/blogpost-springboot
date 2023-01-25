package ch.bbw.pr.springsql.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "author")
@NamedQuery(name = "Author.findAll", query = "FROM Author")
public class Author {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "bio")
    private String bio;

    @OneToMany(mappedBy = "author")
    private List<Article> article;

    public Author() {
    }

    public Author(int id, String name, String email, String password, String bio) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.bio = bio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }
    public List<Article> getArticle() {
        return article;
    }

}
